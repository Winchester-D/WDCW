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

    $('#CourtSurrenderForm').submit(function(event) {
        //event.preventDefault();
        //var char_only = /^[a-zA-Z]+$/;
        var char_only = /^(\w+ ?)*$/;
        var Digits_only = /^[0-9]{1,2}$/;
        var datepattern = /^[0-9]{2}\/[0-9]{2}\/[0-9]{4}$/i;
        var specialchar = /^[^<>%$]*$/;
        if ($("#accuDis").val().length < 1)
        {
            $dialog.html("Sorry! Please select district name");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#pslist").val().length < 1)
        {
            $dialog.html("Sorry! Please select police station ");
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
            $dialog.html("Sorry! Entered Date is not Valid");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#firno").val().length < 1) {
            $dialog.html("Sorry! Entered Date is not Valid");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#proceeding_gd_no").val().length > 100) {
            $dialog.html("Sorry! only 100 characters are allowed");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#acode_accu").val().length > 100) {
            $dialog.html("Sorry! only 100 characters are allowed");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#datepicker1").val().length < 1)
        {
            $dialog.html("Sorry! Please select Date, Time and Place of Arrest/Surrender ");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ((!datepattern.test($("#datepicker1").val()))) {
            $dialog.html("Sorry! Entered Date is not Valid");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if(dojo.widget.byId("accu_arrest_time").getValue()<1){
            $dialog.html("Sorry! please slect arrest time");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#d_no").val().length > 100) {
            $dialog.html("Sorry! only 100 characters are allowed");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu_arrest_ps").val().length > 100) {
            $dialog.html("Sorry! only 100 characters are allowed");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu_arrest_district").val().length > 100) {
            $dialog.html("Sorry! only 100 characters are allowed");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu_surrender_court").val().length > 100) {
            $dialog.html("Sorry! only 100 characters are allowed");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu_acts_sec").val().length < 1) {
            $dialog.html("Sorry! Please enter Acts and Sections");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu_acts_sec").val().length > 50) {
            $dialog.html("Sorry! only 50 characters are allowed in Acts and Sections field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu_name").val().length < 1) {
            $dialog.html("Sorry! please enter Name");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu_name").val().length > 50) {
            $dialog.html("only 50 characters are allowed in name field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accu_name").val())) {
            $dialog.html("Sorry! special characters are not allowed in name field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu_fathers_name").val().length > 50) {
            $dialog.html("Sorry! only 50 characters are allowed in father's name");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu_first_alias").val().length > 50) {
            $dialog.html("Sorry! only 50 characters are allowed in alias name");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu_sec_alias").val().length > 50) {
            $dialog.html("Sorry! only 100 characters are allowed in alias name");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#acc_nationality").val().length > 100) {
            $dialog.html("Sorry! only 100 characters are allowed in nationality");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!specialchar.test($("#acc_nationality").val())) {
            $dialog.html("Sorry! special caharacters are not allowed in nationality field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#acc_voter_id").val().length > 100) {
            $dialog.html("Sorry! only 100 characters are allowed in voter id");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu_pp_no").val().length > 20) {
            $dialog.html("Sorry! only 20 characters are allowed in passport no field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#datepicker2").val().length !==0 && !datepattern.test($("#datepicker2").val())) {
            $dialog.html("Sorry! invalid passsport date format in passport");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu_pp_issu_place").val().length > 100) {
            $dialog.html("Sorry! only 100 characters are allowed in passport no field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu_pp_issu_place").val().length != 0 && !char_only.test($("#accu_pp_issu_place").val())) {

            $dialog.html("Sorry! special characters are not allowed in passport issue place field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu_religion").val().length > 100) {
            $dialog.html("Sorry! only 100 characters are allowed in religion field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu_religion").val().length != 0 && !char_only.test($("#accu_religion").val())) {

            $dialog.html("Sorry! special characters are allowed in religion place field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu_caste").val().length > 100) {
            $dialog.html("Sorry! only 100 characters are allowed in caste field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu_caste").val().length != 0 && !char_only.test($("#accu_caste").val())) {

            $dialog.html("Sorry! special characters are allowed in caste field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;

        }
        else if ($("#accu_caste_type").val().length > 100) {
            $dialog.html("Sorry! only 100 characters are allowed in ST\SC\OBC field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu_caste_type").val().length != 0 && !char_only.test($("#accu_caste_type").val())) {

            $dialog.html("Sorry! special characters are allowed in ST\SC\OBC field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu_occup").val().length > 100) {
            $dialog.html("Sorry! only 100 characters are allowed in occupation field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu_occup").val().length != 0 && !char_only.test($("#accu_occup").val())) {

            $dialog.html("Sorry! special characters are allowed occupation field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;

        }
        else if ($("#permanentAddress").val().length != 0 && !char_only.test($("#permanentAddress").val())) {

            $dialog.html("Sorry! special characters are allowed permanant address field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;

        }
        else if ($("#accu-district").val().length > 100) {
            $dialog.html("Sorry! only 100 characters are allowed in Dist field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu-district").val().length != 0 && !char_only.test($("#accu-district").val())) {

            $dialog.html("Sorry! special characters are allowed Dist field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu-ps").val().length > 100) {
            $dialog.html("Sorry! only 100 characters are allowed in P.S field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accu-ps").val().length != 0 && !char_only.test($("#accu-ps").val())) {
            $dialog.html("Sorry! special characters are allowed P.S field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#presentAddress").val().length != 0 && !char_only.test($("#presentAddress").val())) {

            $dialog.html("Sorry! special characters are allowed presentAddress field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;

        }
        else if ($("#present-ps").val().length > 100) {
            $dialog.html("Sorry! only 100 characters are allowed in P.S field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#present-ps").val().length != 0 && !char_only.test($("#present-ps").val())) {

            $dialog.html("Sorry! special characters are allowed P.S field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;

        }
        else if ($("#accuInjuries").val().length != 0 && !char_only.test($("#accuInjuries").val())) {

            $dialog.html("Sorry! special characters are allowed P.S field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;

        }
        else if ($("#datepicker3").val().length < 1)
        {
            $dialog.html("Sorry! Please select custody Date");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ((!datepattern.test($("#datepicker3").val()))) {
            $dialog.html("Sorry! invalid custody date format");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accuCustodyPlace").val().length < 1) {
            $dialog.html("Sorry! please enter custody place");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accuCustodyPlace").val().length > 100) {
            $dialog.html("Sorry! only 100 characters are allowed in custody date field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accuCustodyPlace").val())) {
            $dialog.html("Sorry! special characters are not allowed custody placefield");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        /*
         * To get struts datetimepicker value 
         */        
        else if ((dojo.widget.byId("custodyTime").getValue())<1) {
            $dialog.html("Sorry! please select custody time");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        
        else if ($("#accuSearchArticle1").val().length > 100) {
            $dialog.html("Sorry! only 100 characters are allowed in P.S field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accuSearchArticle2").val().length > 100) {
            $dialog.html("Sorry! only 100 characters are allowed in P.S field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accuIntimationName").val().length < 1) {
            $dialog.html("Sorry! please enter intimation name");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accuIntimationName").val().length > 100) {
            $dialog.html("Sorry! only 100 characters are allowed in intimation name field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accuIntimationName").val())) {
            $dialog.html("Sorry! special characters are not allowed intimation name field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        } else if ($("#accuIntimationRelation").val().length < 1) {
            $dialog.html("Sorry! please enter intimation relation");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accuIntimationRelation").val().length > 100) {
            $dialog.html("Sorry! only 100 characters are allowed in intimation name field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accuIntimationRelation").val())) {
            $dialog.html("Sorry! special characters are not allowed intimation name field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#datepicker4").val().length < 1)
        {
            $dialog.html("Sorry! Please select intimation Date");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ((!datepattern.test($("#datepicker4").val()))) {
            $dialog.html("Sorry! invalid date format");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        /*
         * To get struts datetimepicker value
         */
        else if ((dojo.widget.byId("intimatedTime").getValue())<1) {
            $dialog.html("Sorry! please select intimation time");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accuGender").val().length < 1) {
            $dialog.html("Sorry! please select gender");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accuAge1").val().length===0) {
            $dialog.html("Sorry! please enter age");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accuAge1").val().length > 10) {
            $dialog.html("Sorry! only 10 characters are allowed in age field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!Digits_only.test($("#accuAge1").val())) {
            $dialog.html("Sorry! only numbers are allowed in age");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accuBuild").val().length != 0 && $("#accuBuild").val().length > 100) {
            $dialog.html("Sorry! only 30 characters are  allowed in build field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accuBuild").val())) {
            $dialog.html("Sorry! special characters are not allowed in build field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accuHeight").val().length != 0 && $("#accuHeight").val().length > 100) {

            $dialog.html("Sorry! only 30 characters are  allowed in height field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accuBuild").val())) {
            $dialog.html("Sorry! special characters are not allowed height name field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accuComplexion").val().length != 0 && $("#accuComplexion").val().length > 100) {
            $dialog.html("Sorry! only 30 characters are  allowed in complexion field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accuBuild").val())) {
            $dialog.html("Sorry! special characters are not allowed complexion name field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accuIdentMarks").val().length != 0 && $("#accuIdentMarks").val().length > 100) {

            $dialog.html("Sorry! only 30 characters are  allowed in identification marks field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accuIdentMarks").val())) {
            $dialog.html("Sorry! special characters are not allowed in identification marks field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accuDeformities").val().length != 0 && $("#accuDeformities").val().length > 100) {
            $dialog.html("Sorry! only 30 characters are  allowed in deformities field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accuDeformities").val())) {
            $dialog.html("Sorry! special characters are not allowed deformities field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accuTeeth").val().length != 0 && $("#accuTeeth").val().length > 100) {

            $dialog.html("Sorry! only 30 characters are  allowed in teeth field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accuTeeth").val())) {
            $dialog.html("Sorry! special characters are not allowed in teeth field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }

        else if ($("#accuHair").val().length != 0 && $("#accuHair").val().length > 100) {

            $dialog.html("Sorry! only 30 characters are  allowed in Hair field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accuHair").val())) {
            $dialog.html("Sorry! special characters are not allowed in Hair field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }

        else if ($("#accuEyes").val().length != 0 && $("#accuEyes").val().length > 100) {
            $dialog.html("Sorry! only 30 characters are  allowed in eyes field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accuEyes").val())) {
            $dialog.html("Sorry! special characters are not allowed in eyes field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;

        }
        else if ($("#accuHabits").val().length != 0 && $("#accuHabits").val().length > 100) {

            $dialog.html("Sorry! only 30 characters are  allowed in habits field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accuHabits").val())) {
            $dialog.html("Sorry! special characters are not allowed in habits field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;

        }
        else if ($("#accuDressHabits").val().length != 0 && $("#accuDressHabits").val().length > 100) {

            $dialog.html("Sorry! only 30 characters are  allowed in dress habits field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accuDressHabits").val())) {
            $dialog.html("Sorry! special characters are not allowed in dress habits field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;

        }
        else if ($("#accuLanguage").val().length != 0 && $("#accuLanguage").val().length > 100) {

            $dialog.html("Sorry! only 30 characters are  allowed in language field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accuLanguage").val())) {
            $dialog.html("Sorry! special characters are not allowed in language field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;

        }
        else if ($("#accuBurnMark").val().length != 0 && $("#accuBurnMark").val().length > 100) {

            $dialog.html("Sorry! only 30 characters are  allowed in BurnMark field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accuBurnMark").val())) {
            $dialog.html("Sorry! special characters are not allowed in BurnMark field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;

        }
        else if ($("#accuLeucoderma").val().length != 0 && $("#accuLeucoderma").val().length > 100) {

            $dialog.html("Sorry! only 30 characters are  allowed in Leucoderma field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accuLeucoderma").val())) {
            $dialog.html("Sorry! special characters are not allowed in Leucoderma field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;

        }
        else if ($("#accuMole").val().length != 0 && $("#accuMole").val().length > 100) {
            $dialog.html("Sorry! only 30 characters are  allowed in Mole field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accuMole").val())) {
            $dialog.html("Sorry! special characters are not allowed in Mole field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;

        }
        else if ($("#accuSear").val().length != 0 && $("#accuSear").val().length > 100) {
            $dialog.html("Sorry! only 30 characters are  allowed in Sear field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accuSear").val())) {
            $dialog.html("Sorry! special characters are not allowed in Sear field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;

        }
        else if ($("#accuTatoo").val().length != 0 && $("#accuTatoo").val().length > 100) {
            $dialog.html("Sorry! only 30 characters are  allowed in Tatoo field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accuTatoo").val())) {
            $dialog.html("Sorry! special characters are not allowed in Tatoo field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#accuOtherFeatures").val().length != 0 && $("#accuOtherFeatures").val().length > 200) {

            $dialog.html("Sorry! only 200 characters are  allowed in Other Features field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accuOtherFeatures").val())) {
            $dialog.html("Sorry! special characters are not allowed in Other Features field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;

        }
        else if ($("#accuEduQua").val().length !== 0 && $("#accuEduQua").val().length > 100) {
            $dialog.html("Sorry! only 30 characters are  allowed in education field field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accuEduQua").val())) {
            $dialog.html("Sorry! special characters are not allowed in education field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;

        }
        else if ($("#accuRealOccu").val().length != 0 && $("#accuRealOccu").val().length > 100) {

            $dialog.html("Sorry! only 30 characters are  allowed in Occupation field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#accuRealOccu").val())) {
            $dialog.html("Sorry! special characters are not allowed in Occupation field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;

        }
        else if ($("#nameAddrWitness1").val().length != 0 && $("#nameAddrWitness1").val().length > 1000) {

            $dialog.html("Sorry! only 300 characters are  allowed in nameAddrWitness field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#nameAddrWitness1").val())) {
            $dialog.html("Sorry! special characters are not allowed in nameAddrWitness field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;

        }
        else if ($("#nameAddWitness2").val().length != 0 && $("#nameAddWitness2").val().length > 1000) {

            $dialog.html("Sorry! only 300 characters are  allowed in nameAddrWitness field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#nameAddWitness2").val())) {
            $dialog.html("Sorry! special characters are not allowed in nameAddrWitness field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;

        }
        else if ($("#courtSurrPlace").val().length < 1) {
            $dialog.html("Sorry! please enter place");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#courtSurrPlace").val().length > 50) {
            $dialog.html("only 50 characters are allowed in place field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#courtSurrPlace").val())) {
            $dialog.html("Sorry! special characters are not allowed in place field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#ioName").val().length < 1) {
            $dialog.html("Sorry! please enter officer name");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#ioName").val().length > 50) {
            $dialog.html("only 50 characters are allowed in officer name field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#ioName").val())) {
            $dialog.html("Sorry! special characters are not allowed in officer name field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#datepicker5").val().length < 1)
        {
            $dialog.html("Sorry! Please select Date");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ((!datepattern.test($("#datepicker5").val()))) {
            $dialog.html("Sorry! Entered Date is not Valid");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#ioRank").val().length < 1) {
            $dialog.html("Sorry! please enter officer rank");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if ($("#ioRank").val().length > 50) {
            $dialog.html("only 50 characters are allowed in officer rank field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        }
        else if (!char_only.test($("#ioRank").val())) {
            $dialog.html("Sorry! special characters are not allowed in officer rank field");
            $dialog.parent().addClass("ui-state-error");
            $dialog.dialog('open');
            return false;
        } else {
            return true;
        }


    });
});