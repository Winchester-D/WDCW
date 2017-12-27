/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

$(function() {
    var $dialog = $('<div></div>')
            .html('This dialog will show every time!')
            .dialog({
        autoOpen: false,
        height: 200,
        width: 250,
        modal: true,
        title: 'ERROR'.fontcolor('#FF0000'),
        buttons: {
            Ok: function() {
                $dialog.dialog('close');
            }
        }
    });
    //$dialog.dialog('open');
    $('#firForm').submit(function(event) {
        //event.preventDefault();
        //var char_only = /^[a-zA-Z]+$/;
        var char_only = /^(\w+ ?)*$/;
        var Digits_only = /^[0-9]{1,2}$/;
        var datepattern = /^[0-9]{2}\/[0-9]{2}\/[0-9]{4}$/i;
        var specialchar = /^[^<>%$]*$/;
        if ($("#fir_police_station").val().length < 1)
        {
            $dialog.html("Sorry! Please select police station name");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (($("#fir_police_station").val().length > 30)) {
            $dialog.html("Sorry! only 30 characters allowed in police station name");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#fir_police_station").val())) {
            $dialog.html("Sorry! special characters are not allowed in PS field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_fir_no").val().length < 1) {
            $dialog.html("Sorry! Please enter fir no ");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (($("#fir_fir_no").val().length > 30)) {
            $dialog.html("Sorry! only 30 characters allowed in FIR field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        if (!specialchar.test($("#fir_fir_no").val())) {
            $dialog.html("Sorry! special characters are not allowed in FIR field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#datepicker").val().length < 1)
        {
            $dialog.html("Sorry! Please select Date");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ((!datepattern.test($("#datepicker").val()))) {
            $dialog.html("Sorry! invalid date format");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        if ($("#fir_act1").val().length < 1)
        {
            $dialog.html("Sorry! Please enter acts1");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_act1").val().length > 40) {
            $dialog.html("Sorry! Only 40 characters are allowed in acts 1 field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        if ($("#fir_section1").val().length < 1)
        {
            $dialog.html("Sorry! Please enter sections 1");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_section1").val().length > 40) {
            $dialog.html("Sorry! Only 40 characters are allowed in sections 1 field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_act2").val().length != 0 && $("#fir_act2").val().length > 40) {
            $dialog.html("Sorry! Only 40 characters are allowed in acts 2 field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_section2").val().length != 0 && $("#fir_section2").val().length > 40) {
            $dialog.html("Sorry! Only 40 characters are allowed in section 2 field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;

        }
        else if ($("#fir_act3").val().length != 0 && $("#fir_act3").val().length > 40) {
            $dialog.html("Sorry! Only 40 characters are allowed in acts 3 field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }

        else if ($("#fir_section3").val().length != 0 && $("#fir_section3").val().length > 40) {
            $dialog.html("Sorry! Only 40 characters are allowed in section 3 field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_other_act_sec").val().length != 0 && $("#fir_other_act_sec").val().length > 40) {

            $dialog.html("Sorry! Only 40 characters are allowed in fir_other_act_sec field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#datepicker1").val().length < 1)
        {
            $dialog.html("Sorry! Please select offence Date");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ((!datepattern.test($("#datepicker1").val()))) {
            $dialog.html("Sorry! invalid offence date format");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        /*else if ($("#firoffencetime").val().length < 1)*
         * It is modified to access struts datetimepicker value 
         */
        else if (dojo.widget.byId("firoffencetime").getValue()<1)
        {
            //alert(dojo.widget.byId("firoffencetime").getValue());
            $dialog.html("Sorry! Please select offence time");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ((!specialchar.test(dojo.widget.byId("firoffencetime").getValue()))) {
            $dialog.html("Sorry! invalid offence date format");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#datepicker2").val().length < 1)
        {
            $dialog.html("Sorry! Please select Information received at P.S Date");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ((!datepattern.test($("#datepicker2").val()))) {
            $dialog.html("Sorry! invalid Information received at P.S date format");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        //else if ($("#fir_ps_info_rec_time").val().length < 1)//
        else if (dojo.widget.byId("fir_ps_info_rec_time").getValue()< 1)
        {
            $dialog.html("Sorry! Please select Information received at P.S time");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ((!specialchar.test(dojo.widget.byId("fir_ps_info_rec_time").getValue()))) {
            $dialog.html("Sorry! invalid Information received at P.S  time");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_gen_dairy_ref_entry_no").val().length < 1)
        {
            $dialog.html("Sorry! Please enter general diary entry no");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_gen_dairy_ref_entry_no").val().length > 40) {
            $dialog.html("Sorry! only 40 characters are allowed in general diary entry no");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        /*else if ($("#fir_gen_dairy_ref_time").val().length < 1)
         **/
        else if ((dojo.widget.byId("fir_gen_dairy_ref_time").getValue()).length < 1)
        {
            $dialog.html("Sorry! Please select general diary time");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ((!specialchar.test($("#fir_gen_dairy_ref_time").val()))) {
            $dialog.html("Sorry! special chracters are not allowed in general diary time");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_type_of_info").val().length != 0 && $("#fir_type_of_info").val().length > 40) {
            $dialog.html("Sorry! Only 40 characters are allowed in type of information field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_offence_place_ps_dist").val().length != 0 && $("#fir_offence_place_ps_dist").val().length > 40) {
            $dialog.html("Sorry! Only 40 characters are allowed in Place of occurrence PS field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_offence_place_beat_no").val().length != 0 && $("#fir_offence_place_beat_no").val().length > 40) {
            $dialog.html("Sorry! Only 40 characters are allowed in beat no field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        
        else if ($("#fir_offence_place_address").val().length <1) {
            $dialog.html("Sorry! please enter address");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        
        else if ($("#fir_offence_place_address").val().length != 0 && !specialchar.test($("#fir_offence_place_address").val())) {
            $dialog.html("Sorry! special characters are not allowed in address field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }

        else if ($("#fir_outside_limit_ps").val().length != 0 && $("#fir_outside_limit_ps").val().length > 30) {

            $dialog.html("Sorry! only 30 characters allowed in outside PS field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!specialchar.test($("#fir_outside_limit_ps").val())) {
            $dialog.html("Sorry! special characters are not allowed in outside PS field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }

        else if ($("#fir_outside_limit_ps_district").val().length != 0 && $("#fir_outside_limit_ps_district").val().length > 20) {

            $dialog.html("Sorry! only 20 characters allowed in outside PS district field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!specialchar.test($("#fir_outside_limit_ps_district").val())) {
            $dialog.html("Sorry! special characters are not allowed in outside PS district field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }

        else if ($("#fir_c_name").val().length < 1) {
            $dialog.html("Sorry! please enter name of Complainan");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_c_name").val().length != 0 && $("#fir_c_name").val().length > 50) {

            $dialog.html("Sorry! only 50 characters allowed in Complainan name field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!specialchar.test($("#fir_c_name").val())) {
            $dialog.html("Sorry! special characters are not allowed in Complainan name field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }

        else if ($("#fir_c_father_name").val().length != 0 && $("#fir_c_father_name").val().length > 50) {
            $dialog.html("Sorry! only 50 characters allowed in Complainan father name field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!specialchar.test($("#fir_c_father_name").val())) {
            $dialog.html("Sorry! special characters are not allowed in Complainan father name field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#datepicker3").val().length != 0 && !datepattern.test($("#datepicker").val())) {
            $dialog.html("Sorry! invalid date format in Complainan DOB field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }

        else if ($("#fir_c_age").val().length !== 0 && $("#fir_c_age").val().length > 5) {
            $dialog.html("Sorry! only 5 characters allowed in Complainan age field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!specialchar.test($("#fir_c_father_name").val())) {
            $dialog.html("Sorry! special characters are not allowed in Complainan age field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }

        else if ($("#fir_c_nationality").val().length != 0 && $("#fir_c_nationality").val().length > 30) {

            $dialog.html("Sorry! only 30 characters allowed in nationality field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!specialchar.test($("#fir_c_nationality").val())) {
            $dialog.html("Sorry! special characters are not allowed in nationality field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_c_pp_no").val().length != 0 && $("#fir_c_pp_no").val().length > 10) {

            $dialog.html("Sorry! only 10 characters allowed in Passport No field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!specialchar.test($("#fir_c_pp_no").val())) {
            $dialog.html("Sorry! special characters are not allowed in Passport No field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }

        else if ($("#datepicker4").val().length != 0 && !datepattern.test($("#datepicker4").val())) {
            $dialog.html("Sorry! invalid date format in passport issue date field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }

        else if ($("#fir_c_pp_issue_place").val().length != 0 && $("#fir_c_pp_issue_place").val().length > 30) {
            $dialog.html("Sorry! only 30 characters allowed in Passport issue field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!specialchar.test($("#fir_c_pp_issue_place").val())) {
            $dialog.html("Sorry! special characters are not allowed in Passport issue field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }

        else if ($("#fir_c_occu").val().length != 0 && $("#fir_c_occu").val().length > 30) {

            $dialog.html("Sorry! only 30 characters allowed in occupation field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!specialchar.test($("#fir_c_occu").val())) {
            $dialog.html("Sorry! special characters are not allowed in occupation field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }

        else if ($("#fir_c_address").val().length != 0 && !specialchar.test($("#fir_c_address").val())) {
                $dialog.html("Sorry! special characters are not allowed in address field");
                $dialog.parent().addClass("ui-state-error");
                $dialog.dialog('open');
                return false;
        }
        else if ($("#fir_suspect_details").val().length != 0 && !specialchar.test($("#fir_suspect_details").val())) {

            $dialog.html("Sorry! special characters are not allowed in suspect details field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }

        else if ($("#fir_c_repo_delay_rea").val().length != 0 && !specialchar.test($("#fir_c_repo_delay_rea").val())) {
            $dialog.html("Sorry! special characters are not allowed in reasons for delay field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_invo_prop_paticu").val().length < 1) {
            $dialog.html("Sorry! Please enter particulars of properties stolen");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_invo_prop_paticu").val().length != 0 && !specialchar.test($("#fir_suspect_details").val())) {

            $dialog.html("Sorry! special characters are not allowed in particulars of properties stolen field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;

        }
        else if ($("#fir_invo_prop_tot_val").val().length < 1) {
            $dialog.html("Sorry! Please enter Total value of properties stolen");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_invo_prop_tot_val").val().length != 0 && $("#fir_invo_prop_tot_val").val().length > 50) {

            $dialog.html("Sorry! only 50 characters are  allowed in Total value of properties stolen field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!specialchar.test($("#fir_invo_prop_tot_val").val())) {
            $dialog.html("Sorry! special characters are not allowed in Total value of properties stolen field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }

        else if ($("#fir_ud_case_no").val().length != 0 && $("#fir_ud_case_no").val().length > 50) {

            $dialog.html("Sorry! only 50 characters are  allowed in UD Case field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!specialchar.test($("#fir_ud_case_no").val())) {
            $dialog.html("Sorry! special characters are not allowed in UD Case field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_fir_contents").val().length != 0 && !specialchar.test($("#fir_fir_contents").val())) {
            $dialog.html("Sorry! special characters are not allowed in fir content field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_io_name").val().length != 0 && $("#fir_io_name").val().length > 50) {

            $dialog.html("Sorry! only 50 characters are  allowed in IO name  field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!specialchar.test($("#fir_io_name").val())) {
            $dialog.html("Sorry! special characters are not allowed in IO name field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_io_rank").val().length != 0 && $("#fir_io_rank").val().length > 40) {

            $dialog.html("Sorry! only 40 characters are  allowed in IO rank field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!specialchar.test($("#fir_io_rank").val())) {
            $dialog.html("Sorry! special characters are not allowed in IO rank field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_io_sjpu").val().length != 0 && $("#fir_io_sjpu").val().length > 30) {
            $dialog.html("Sorry! only 30 characters are  allowed in SJPU field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!specialchar.test($("#fir_io_sjpu").val())) {
            $dialog.html("Sorry! special characters are not allowed in SJPU field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_transferred_ps").val().length != 0 && $("#fir_transferred_ps").val().length > 30) {

            $dialog.html("Sorry! only 30 characters are  allowed in transferred P.S field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!specialchar.test($("#fir_transferred_ps").val())) {
            $dialog.html("Sorry! special characters are not allowed in transferred P.S field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }

        else if ($("#fir_incharge_name").val().length < 1) {
            $dialog.html("Sorry! enter officer incharge name");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_incharge_name").val().length != 0 && $("#fir_incharge_name").val().length > 50) {

            $dialog.html("Sorry! only 50 characters are  allowed in officer incharge field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!specialchar.test($("#fir_incharge_name").val())) {
            $dialog.html("Sorry! special characters are not allowed in officer incharge field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_incharge_rank").val().length < 1) {
            $dialog.html("Sorry! enter officer incharge rank");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_incharge_rank").val().length != 0 && $("#fir_incharge_rank").val().length > 40) {
            $dialog.html("Sorry! only 40 characters are  allowed in officer incharge rank field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!specialchar.test($("#fir_incharge_rank").val())) {
            $dialog.html("Sorry! special characters are not allowed in officer incharge rank field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_incharge_no").val().length < 1) {
            $dialog.html("Sorry! enter officer incharge no");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#fir_incharge_no").val().length != 0 && $("#fir_incharge_no").val().length > 30) {
            $dialog.html("Sorry! only 30 characters are  allowed in officer incharge no field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!specialchar.test($("#fir_incharge_no").val())) {
            $dialog.html("Sorry! special characters are not allowed in officer incharge no field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#datepicker5").val().length < 1)
        {
            $dialog.html("Sorry! Please select dispatch Date");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ((!datepattern.test($("#datepicker5").val()))) {
            $dialog.html("Sorry! invalid dispatch date format");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        
        /*else if ($("#fir_court_dispach_time").val().length < 1)*/
        else if ((dojo.widget.byId("fir_court_dispach_time").getValue()).length < 1)
        {
            $dialog.html("Sorry! Please select dispatch time");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }else{
            return true;
        }
        
    });
});

   