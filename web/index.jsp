<%-- 
    Document   : index
    Created on : Oct 28, 2017, 12:12:43 PM
    Author     : Rajat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix = "sx" uri = "/struts-dojo-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Welcome to Telangana Child Homes</title> 
        <s:head />

        <link rel="stylesheet" type="text/css" href="style.css"/>
        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="jq/jquery-ui.css"/>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="/apis/fusiontables/docs/samples/style/default.css"
              rel="stylesheet" type="text/css">
        <script src="jq/jquery-1.8.2.js"></script>
        <script src="jq/jquery-ui.js"></script>
        

        <script type="text/javascript">

            function validate()
            {
                var $dialog = $('<div></div>')
                        .html('This dialog will show every time!')
                        .dialog({
                            autoOpen: false,
                            height: 160,
                            width: 250,
                            modal: true,
                            /*to add red color to the title*/
                            title: '<s:text name="label.err.error"/>'.fontcolor('#FF0000'),
                            buttons: {
                                Ok: function () {
                                    $dialog.dialog('close');
                                }
                            }
                        });
                if (document.getElementById("userId_txt").value.length < 1)
                {

                    $dialog.html("<s:text name="index.err.entUserId"/>");
                    $dialog.parent().addClass("ui-state-error");
                    $dialog.dialog('open');
                    return false;
                } else if (document.getElementById("passwd_txt").value.length < 1)
                {
                    $dialog.html("<s:text name="index.err.entPass"/>");
                    $dialog.parent().addClass("ui-state-error");
                    $dialog.dialog('open');
                    return false;

                }
            }
            function selLang2(thisf)
            {

                // alert("***********"+thisf.selectedValue);

                /*  if(document.getElementById('sel_lan2').selectedValue=='en')
                 {
                 alert("english");
                 document.indexForm.action="/WDCW_hin2/index.action?request_locale=en";
                 
                 document.indexForm.submit();
                 }
                 else if(document.getElementById('sel_lan2').selectedValue=='hi')
                 {
                 alert("hindi"); */

                var e = document.getElementById("sel_lan2");
                var strUser = e.options[e.selectedIndex].value;


                //alert("********"+strUser);

                if (strUser !== 'sel')
                {
                    document.indexForm.action = "index.action?request_locale=" + strUser;
                    document.indexForm.submit();
                } else
                {
                    alert("Select Language");
                }
                //}
            }
            
            function callform1()
            {
                document.getElementById("indexForm1").action = "CW-Found-Child";
                document.getElementById("indexForm1").submit();
            }
            $(document).ready(function () {
                $("#right-cwc").show();
                $("#aboutusdata").hide();
                $("#homelink").css("background-color", "darkgray");
                $("#aboutuslink").click(function () {
                    $("#homelink").css("background-color", "rgba(192,192,192,.1)");
                    $("#aboutuslink").css("background-color", "darkgray");
                    $("#homedata").hide();
                    $("#aboutusdata").show();
                });
                $("#homelink").click(function () {
                    $("#aboutuslink").css("background-color", "rgba(192,192,192,.1)");
                    $("#homelink").css("background-color", "darkgray");
                    $("#aboutusdata").hide();
                    $("#homedata").show();
                });
                $("#Latest_Updates").show();
                $("#cwcbtn").click(function () {


                    if ($("#right-dcpu").css('display') === 'block')
                    {

                        $("#right-dcpu").hide();
                        $("#right-cwc").fadeIn();
                    } else if ($("#right-ccl").css('display') == 'block')
                    {
                        $("#right-ccl").hide();
                       // $("#right-cci").hide();
                        $("#right-cwc").fadeIn();
                        
                    }
                    else if ($("#right-cci").css('display') == 'block')
                    {
                        $("#right-ccl").hide();
                        $("#right-cci").hide();
                        $("#right-cwc").fadeIn();
                        
                    }
                    
                    else
                    {

                        if ($("#right-cwc").css('display') === 'none')
                        {
                            $("#Latest_Updates").hide();
                            $("#right-dcpu").css('display') === 'none';
                            $("#right-dcpu").hide();
                            $("#right-cwc").css('display') === 'block';


                            $("#right-cwc").fadeToggle();
                            //}
                        } else
                        {
                            $("#Latest_Updates").show();
                            $("#right-cwc").fadeToggle();
                            $("#right-cwc").css('display') === 'none';
                        }
                    }
                });
                $("#dcpubtn").click(function () {

                    if ($("#right-cwc").css('display') === 'block')
                    {

                        $("#right-cwc").hide();
                        $("#right-dcpu").fadeIn();
                    } else if ($("#right-ccl").css('display') == 'block')
                    {
                        $("#right-ccl").hide();
                        $("#right-cci").hide();
                        $("#right-dcpu").fadeIn();
                    } 
                    else if ($("#right-cci").css('display') == 'block')
                    {
                        $("#right-ccl").hide();
                        $("#right-cci").hide();
                        $("#right-dcpu").fadeIn();
                    } 
                    
                    
        else {
                        if ($("#right-dcpu").css('display') === 'none')
                        {
                            $("#Latest_Updates").hide();
                            $("#right-cwc").css('display') === 'none';
                            $("#right-cwc").hide();
                            $("#right-dcpu").css('display') === 'block';
                            $("#right-dcpu").fadeToggle();
                        } else
                        {
                            $("#Latest_Updates").show();
                            $("#right-dcpu").fadeToggle();

                            $("#right-dcpu").css('display') === 'none';
                        }
                    }
                });
                $("#cclbtn").click(function () {
                    if ($("#right-cwc").css('display') == 'block')
                    {
                        $("#right-cwc").hide();
                        $("#right-ccl").fadeIn();
                    }
                    else if ($("#right-dcpu").css('display') == 'block')
                    {
                        $("#right-dcpu").hide();
                        
                        $("#right-ccl").fadeIn();
                    } 
                    else if ($("#right-cci").css('display') == 'block')
                    {
                        $("#right-cci").hide();
                        
                        $("#right-ccl").fadeIn();
                    } 
                    
        
                    else
                    {
                        $("#right-ccl").fadeToggle();
                    }
                });
                
                   $("#ccibtn").click(function () {
                    if ($("#right-cwc").css('display') == 'block')
                    {
                        $("#right-cwc").hide();
                        $("#right-cci").fadeIn();
                    } else if ($("#right-dcpu").css('display') == 'block')
                    {
                        $("#right-dcpu").hide();
                         
                        $("#right-cci").fadeIn();
                    } 
                    else if ($("#right-ccl").css('display') == 'block')
                    {
                        $("#right-ccl").hide();
                        
                        $("#right-cci").fadeIn();
                    } 
        
                     else
                    {
                        $("#right-cci").fadeToggle();
                       
                    }
                });
            });
            
 
   
            function callform2()
            {
                if (document.getElementById("right-cwc").style.display === 'none')
                {
                    $("right-cwc").slideDown();
                } else
                {
                    document.getElementById("right-cwc").style.display = "none";
                }
            }
            function callform3()
            {
                if (document.getElementById("right-dcpu").style.display === 'none')
                {
                    // document.getElementById("left-dcpu").style.display="none";
                    document.getElementById("right-dcpu").style.display = "block";
                } else
                {
                    document.getElementById("right-dcpu").style.display = "none";
                }
            }
            function  callccl()
            {
                alert("***Under Construction****");
            }

        </script>  
                    
                    <style>
                        
                        
                        .sticky-container{
    padding:0px;
    margin:0px;
    position:fixed;
    right:-130px;
    top:230px;
    width:210px;
    z-index: 1100;
}
.sticky li{
    list-style-type:none;
    background-color:#fff;
    color:#efefef;
    height:43px;
    padding:0px;
    margin:0px 0px 1px 0px;
    -webkit-transition:all 0.25s ease-in-out;
    -moz-transition:all 0.25s ease-in-out;
    -o-transition:all 0.25s ease-in-out;
    transition:all 0.25s ease-in-out;
    cursor:pointer;
}
.sticky li:hover{
    margin-left:-115px;
}
.sticky li img{
    float:left;
    margin:5px 4px;
    margin-right:5px;
}
.sticky li p{
    padding-top:5px;
    margin:0px;
    line-height:16px;
    font-size:11px;
}
.sticky li p a{
    text-decoration:none;
    color:#2C3539;
}
.sticky li p a:hover{
    text-decoration:underline;
}
                        
                        
                    </style>
    </head>
    <body>


        <div id="header" class="container-fluid">
            <a href="http://www.telangana.gov.in/" title="Visit to Telangana Government Website"> <img src="images/govt.png" alt="Go to Telangana Website" style="position:absolute;left:100px;top:15px"></a>
            <!--<img  alt="Source Not Available" style="position:absolute;left:550px;top:9px">-->
            <h1>Women Development and Child Welfare Department <br>
                Government of Telangana </h1>
            <p>Telangana State Juvenile Justice System</p>

            <h2>Chetna | Vikas | Suraksha </h2>
        </div>

        <div class="container" id="map">
        </div>
        <script type="text/javascript">
            function eventcalling(marker, infowindow)
            {
                infowindow.open(map, marker);
                map.setCenter(marker.getPosition());
            }
            function myMap() {

                var Telangana = new google.maps.LatLng(17.90000, 80.555550);
                var Hyderabad = new google.maps.LatLng(17.385044, 78.486671);
                var Adilabad = new google.maps.LatLng(19.664062, 78.532011);
                var Karimnagar = new google.maps.LatLng(18.438555, 79.128841);
                var Khammam = new google.maps.LatLng(17.247253, 80.151445);
                var Mahabubnagar = new google.maps.LatLng(16.737509, 78.008122);
                var Nalgonda = new google.maps.LatLng(17.188300, 79.199995);
                var Nizamabad = new google.maps.LatLng(18.672505, 78.094087);
                var Ramagundam = new google.maps.LatLng(18.759550, 79.481638);
                var Suryapet = new google.maps.LatLng(17.135315, 79.633367);
                var Bhadradri_Kothagudem = new google.maps.LatLng(17.482590, 80.649283);
                var Jagtial = new google.maps.LatLng(18.790894, 78.911851);
                var Jangaon = new google.maps.LatLng(17.728839, 79.160497);
                var Jayashankar_Bhupalapally = new google.maps.LatLng(17.362867, 75.374312);
                var Jogulamba_Gadwal = new google.maps.LatLng(15.876991, 78.134626);
                var Kamareddy = new google.maps.LatLng(18.323995, 78.334305);
                var Kumarambheem_Asifabad = new google.maps.LatLng(19.433333, 79.223889);
                var Mahabubabad = new google.maps.LatLng(17.597528, 80.001531);
                var Mancherial = new google.maps.LatLng(18.875595, 79.459138);
                var Medak = new google.maps.LatLng(18.052936, 78.261853);
                var Medchal_Malkajgiri = new google.maps.LatLng(17.487348, 78.482340);
                var Nagarkurnool = new google.maps.LatLng(16.493942, 78.310249);
                var Nirmal = new google.maps.LatLng(19.096412, 78.342975);
                var Peddapalli = new google.maps.LatLng(18.616183, 79.383160);
                var Rajanna_Sircilla = new google.maps.LatLng(18.386576, 78.805607);
                var Ranga_Reddy = new google.maps.LatLng(17.389138, 77.836728);
                var Sangareddy = new google.maps.LatLng(17.619416, 78.082308);
                var Siddipet = new google.maps.LatLng(18.101904, 78.852077);
                var Vikarabad = new google.maps.LatLng(17.336430, 77.904848);
                var Wanaparthy = new google.maps.LatLng(16.362312, 78.062182);
                var Warangal_Rural = new google.maps.LatLng(18.002834, 79.518188);
                var Warangal_Urban = new google.maps.LatLng(17.974439, 79.919270);
                var Yadadri_Bhuvanagiri = new google.maps.LatLng(17.522345, 78.895796);
                var mapProp = {
                    center: Jangaon,
                    zoom: 7
                };

                var map = new google.maps.Map(document.getElementById("map"), mapProp);
                var layer = new google.maps.FusionTablesLayer();
                layer.setOptions({
                    query: {
                        select: 'geometry',
                        from: '1bG3JUPYReMKh5XJvwGFsHDPT82JOrBR7mHslgCs4'
                    }
                });

                var hyderabad_marker = new google.maps.Marker({
                    position: Hyderabad,
                    map: map,
                    title: 'Hyderabad'});
                var adilabad_marker = new google.maps.Marker({
                    position: Adilabad,
                    map: map,
                    title: 'Adilabad'});
                var karimnagar_marker = new google.maps.Marker({
                    position: Karimnagar,
                    map: map,
                    title: 'Karimnagar'});
                var khammam_marker = new google.maps.Marker({
                    position: Khammam,
                    map: map,
                    title: 'Khammam'});
                var mahabubnagar_marker = new google.maps.Marker({
                    position: Mahabubnagar,
                    map: map,
                    title: 'Mahabubnagar'});
                var nalgonda_marker = new google.maps.Marker({
                    position: Nalgonda,
                    map: map,
                    title: 'Nalgonda'});
                var nizamabad_marker = new google.maps.Marker({
                    position: Nizamabad,
                    map: map,
                    title: 'Nizamabad'});
                var ramagundam_marker = new google.maps.Marker({
                    position: Ramagundam,
                    map: map,
                    title: 'Ramagundam'});
                var suryapet_marker = new google.maps.Marker({
                    position: Suryapet,
                    map: map,
                    title: 'Suryapet'});
                var bhadradri_kothagudem_marker = new google.maps.Marker({
                    position: Bhadradri_Kothagudem,
                    map: map,
                    title: 'Bhadradri Kothagudem'});
                var jagtial_marker = new google.maps.Marker({
                    position: Jagtial,
                    map: map,
                    title: 'Jagtial'});
                var jangaon_marker = new google.maps.Marker({
                    position: Jangaon,
                    map: map,
                    title: 'Jangaon'});
                var jayashankar_bhupalapally_marker = new google.maps.Marker({
                    position: Jayashankar_Bhupalapally,
                    map: map,
                    title: 'Jayashankar Bhupalapally'});
                var jogulamba_gadwal_marker = new google.maps.Marker({
                    position: Jogulamba_Gadwal,
                    map: map,
                    title: 'Jogulamba Gadwal'});
                var kamareddy_marker = new google.maps.Marker({
                    position: Kamareddy,
                    map: map,
                    title: 'Kamareddy'});
                var kumarambheem_asifabad_marker = new google.maps.Marker({
                    position: Kumarambheem_Asifabad,
                    map: map,
                    title: 'Kumarambheem Asifabad'});
                var mahabubabad_marker = new google.maps.Marker({
                    position: Mahabubabad,
                    map: map,
                    title: 'Mahabubabad'});
                var mancherial_marker = new google.maps.Marker({
                    position: Mancherial,
                    map: map,
                    title: 'Mancherial'});
                var medak_marker = new google.maps.Marker({
                    position: Medak,
                    map: map,
                    title: 'Medak'});
                var medchal_malkajgiri_marker = new google.maps.Marker({
                    position: Medchal_Malkajgiri,
                    map: map,
                    title: 'Medchal Malkajgiri'});
                var nagarkurnool_marker = new google.maps.Marker({
                    position: Nagarkurnool,
                    map: map,
                    title: 'Nagarkurnool'});
                var nirmal_marker = new google.maps.Marker({
                    position: Nirmal,
                    map: map,
                    title: 'Nirmal'});
                var peddapalli_marker = new google.maps.Marker({
                    position: Peddapalli,
                    map: map,
                    title: 'Peddapalli'});
                var rajanna_sircilla_marker = new google.maps.Marker({
                    position: Rajanna_Sircilla,
                    map: map,
                    title: 'Rajanna Sircilla'});
                var ranga_reddy_marker = new google.maps.Marker({
                    position: Ranga_Reddy,
                    map: map,
                    title: 'Ranga Reddy'});
                var sangareddy_marker = new google.maps.Marker({
                    position: Sangareddy,
                    map: map,
                    title: 'Sangareddy'});
                var siddipet_marker = new google.maps.Marker({
                    position: Siddipet,
                    map: map,
                    title: 'Siddipet'});
                var vikarabad_marker = new google.maps.Marker({
                    position: Vikarabad,
                    map: map,
                    title: 'Vikarabad'});
                var wanaparthy_marker = new google.maps.Marker({
                    position: Wanaparthy,
                    map: map,
                    title: 'Wanaparthy'});
                var warangal_rural_marker = new google.maps.Marker({
                    position: Warangal_Rural,
                    map: map,
                    title: 'Warangal Rural'});
                var warangal_urban_marker = new google.maps.Marker({
                    position: Warangal_Urban,
                    map: map,
                    title: 'Warangal Urban'});
                var yadadri_bhuvanagiri_marker = new google.maps.Marker({
                    position: Yadadri_Bhuvanagiri,
                    map: map,
                    title: 'Yadadri_Bhuvanagiri'});

                hyderabad_marker.setMap(map);
                var InfoWindowHyderabad = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Hyderabad </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(hyderabad_marker, "click", function () {
                    eventcalling(hyderabad_marker, InfoWindowHyderabad);
                });

                adilabad_marker.setMap(map);
                var InfoWindowAdilabad = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Adilabad </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(adilabad_marker, "click", function () {
                    eventcalling(adilabad_marker, InfoWindowAdilabad);
                });

                karimnagar_marker.setMap(map);
                var InfoWindowKarimnagar = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Karimnagar </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(karimnagar_marker, "click", function () {
                    eventcalling(karimnagar_marker, InfoWindowKarimnagar);
                });
                khammam_marker.setMap(map);
                var InfoWindowKhammam = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Khammam </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(khammam_marker, "click", function () {
                    eventcalling(khammam_marker, InfoWindowKhammam);
                });
                mahabubnagar_marker.setMap(map);
                var InfoWindowMahabubnagar = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Mahabubnagar </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(mahabubnagar_marker, "click", function () {
                    eventcalling(mahabubnagar_marker, InfoWindowMahabubnagar);
                });
                nalgonda_marker.setMap(map);
                var InfoWindowNalgonda = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Nalgonda </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(nalgonda_marker, "click", function () {
                    eventcalling(nalgonda_marker, InfoWindowNalgonda);
                });
                nizamabad_marker.setMap(map);
                var InfoWindowNizamabad = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Nizamabad </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(nizamabad_marker, "click", function () {
                    eventcalling(nizamabad_marker, InfoWindowNizamabad);
                });
                ramagundam_marker.setMap(map);
                var InfoWindowRamagundam = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Ramagundam </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(ramagundam_marker, "click", function () {
                    eventcalling(ramagundam_marker, InfoWindowRamagundam);
                });
                suryapet_marker.setMap(map);
                var InfoWindowSuryapet = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Suryapet </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(suryapet_marker, "click", function () {
                    eventcalling(suryapet_marker, InfoWindowSuryapet);
                });
                bhadradri_kothagudem_marker.setMap(map);
                var InfoWindowBhadradriKothagudem = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Bhadradri Kothagudem </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(bhadradri_kothagudem_marker, "click", function () {
                    eventcalling(bhadradri_kothagudem_marker, InfoWindowBhadradriKothagudem);
                });
                jagtial_marker.setMap(map);
                var InfoWindowJagtial = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Jagtial </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(jagtial_marker, "click", function () {
                    eventcalling(jagtial_marker, InfoWindowJagtial);
                });
                jangaon_marker.setMap(map);
                var InfoWindowJangaon = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Jangaon </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(jangaon_marker, "click", function () {
                    eventcalling(jangaon_marker, InfoWindowJangaon);
                });
                jayashankar_bhupalapally_marker.setMap(map);
                var InfoWindowJayashankarBhupalapally = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Jayashankar Bhupalapally </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(jayashankar_bhupalapally_marker, "click", function () {
                    eventcalling(jayashankar_bhupalapally_marker, InfoWindowJayashankarBhupalapally);
                });
                jogulamba_gadwal_marker.setMap(map);
                var InfoWindowJogulambaGadwal = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Jogulamba Gadwal </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(jogulamba_gadwal_marker, "click", function () {
                    eventcalling(jogulamba_gadwal_marker, InfoWindowJogulambaGadwal);
                });
                kamareddy_marker.setMap(map);
                var InfoWindowKamareddy = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Kamareddy </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(kamareddy_marker, "click", function () {
                    eventcalling(kamareddy_marker, InfoWindowKamareddy);
                });
                kumarambheem_asifabad_marker.setMap(map);
                var InfoWindowKumarambheemAsifabad = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Kumarabheem Asifabad</span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(kumarambheem_asifabad_marker, "click", function () {
                    eventcalling(kumarambheem_asifabad_marker, InfoWindowKumarambheemAsifabad);
                });
                mahabubabad_marker.setMap(map);
                var InfoWindowMahabubabad = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Mahabubabad </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(mahabubabad_marker, "click", function () {
                    eventcalling(mahabubabad_marker, InfoWindowMahabubabad);
                });
                mancherial_marker.setMap(map);
                var InfoWindowMancherial = new google.maps.InfoWindow({
                    content: "<span class='map_content'>Mancherial </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(mancherial_marker, "click", function () {
                    eventcalling(mancherial_marker, InfoWindowMancherial);
                });
                medak_marker.setMap(map);
                var InfoWindowMedak = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Medak </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(medak_marker, "click", function () {
                    eventcalling(medak_marker, InfoWindowMedak);
                });
                medchal_malkajgiri_marker.setMap(map);
                var InfoWindowMedchalMalkajgiri = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Medchal Malkajgiri </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(medchal_malkajgiri_marker, "click", function () {
                    eventcalling(medchal_malkajgiri_marker, InfoWindowMedchalMalkajgiri);
                });
                nagarkurnool_marker.setMap(map);
                var InfoWindowNagarkurnool = new google.maps.InfoWindow({
                    content: "<span class='map_content'>Nagarkurnool</span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(nagarkurnool_marker, "click", function () {
                    eventcalling(nagarkurnool_marker, InfoWindowNagarkurnool);
                });
                nirmal_marker.setMap(map);
                var InfoWindowNirmal = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Nirmal </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(nirmal_marker, "click", function () {
                    eventcalling(nirmal_marker, InfoWindowNirmal);
                });
                peddapalli_marker.setMap(map);
                var InfoWindowPeddapalli = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Peddapalli </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(peddapalli_marker, "click", function () {
                    eventcalling(peddapalli_marker, InfoWindowPeddapalli);
                });
                rajanna_sircilla_marker.setMap(map);
                var InfoWindowRajannaSircilla = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Rajanna Sircillia </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(rajanna_sircilla_marker, "click", function () {
                    eventcalling(rajanna_sircilla_marker, InfoWindowRajannaSircilla);
                });
                ranga_reddy_marker.setMap(map);
                var InfoWindowRangaReddy = new google.maps.InfoWindow({
                    content: "<span class='map_content'> RangaReddy </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(ranga_reddy_marker, "click", function () {
                    eventcalling(ranga_reddy_marker, InfoWindowRangaReddy);
                });
                sangareddy_marker.setMap(map);
                var InfoWindowSangareddy = new google.maps.InfoWindow({
                    content: "<span class='map_content'> SangaReddy </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(sangareddy_marker, "click", function () {
                    eventcalling(sangareddy_marker, InfoWindowSangareddy);
                });
                siddipet_marker.setMap(map);
                var InfoWindowSiddipet = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Siddipet </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(siddipet_marker, "click", function () {
                    eventcalling(siddipet_marker, InfoWindowSiddipet);
                });
                vikarabad_marker.setMap(map);
                var InfoWindowVikarabad = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Vikarabad </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(vikarabad_marker, "click", function () {
                    eventcalling(vikarabad_marker, InfoWindowVikarabad);
                });
                wanaparthy_marker.setMap(map);
                var InfoWindowWanaparthy = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Wanaparthy </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(wanaparthy_marker, "click", function () {
                    eventcalling(wanaparthy_marker, InfoWindowWanaparthy);
                });
                warangal_rural_marker.setMap(map);
                var InfoWindowWarangalRural = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Warangal Rural </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(warangal_rural_marker, "click", function () {
                    eventcalling(warangal_rural_marker, InfoWindowWarangalRural);
                });
                warangal_urban_marker.setMap(map);
                var InfoWindowWarangalUrban = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Warangal Urban </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(warangal_urban_marker, "click", function () {
                    eventcalling(warangal_urban_marker, InfoWindowWarangalUrban);
                });
                yadadri_bhuvanagiri_marker.setMap(map);
                var InfoWindowYadadriBhuvanagiri = new google.maps.InfoWindow({
                    content: "<span class='map_content'> Yadadri Bhuvanagiri </span>\n\
            <p style=font-size:11px>P. O. AREPALLI, KARIM NAGAR,<br/>TELANGANA (TS), India (IN),<br/> Pin Code:- 505001</p><hr/>\n\
            <i style=margin-top:-15px class=material-icons>home</i> &emsp; &emsp;Child Homes"
                });
                google.maps.event.addListener(yadadri_bhuvanagiri_marker, "click", function () {
                    eventcalling(yadadri_bhuvanagiri_marker, InfoWindowYadadriBhuvanagiri);
                });
                layer.setMap(map);

            }

        </script>  
        <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDdG2Dkn9F3Ebm4RjztJR5GNnCLZwtEgCA&amp;callback=myMap">
        </script>
        <div style="margin-left: 360px;margin-top:-550px">                
            <p style="text-align: right"> <s:a href="%{url_hi}"></s:a>&nbsp;&nbsp;<s:a href="%{url_en}"></s:a></p>
            </div>

            <div class="w3-bar">
                <a href="#" id="homelink" class="w3-bar-item w3-button"><font style="font-family:fantasy;color:black">Home</font></a>
                <a href="#" id="aboutuslink" class="w3-bar-item w3-button"><font style="font-family:fantasy;color:black">About Us</font></a>
                <a href="#"  class="w3-bar-item w3-button"><font style="font-family:fantasy;color:black">Donate Us</font></a>
                <a href="#" class="w3-bar-item w3-button"><font style="font-family:fantasy;color:black">Contact Us</font></a>

            </div>
          
            <div  id="aboutusdata">
                <table>
                    <tr><td>
                                <h1 style="font-size: 20pt;color:rgb(96,96,96)"><s:text name="global.label.mianPage"/></h1>
                        <span style="font-size:10pt;color:rgb(96,96,96)"><s:text name="global.index.matter1"/></span>
                        <span style="font-size:10pt;color:rgb(96,96,96)"> <s:text name="global.index.matter2"/></span>
                        <span style="font-size:10pt;color:rgb(96,96,96)"><s:text name="global.index.matter3"/></span>
                    </td></tr>

            </table> 
        </div>
        <div  id="homedata">
            <table style="margin-left:10px">
                <td style="vertical-align:top">
                    <table style="margin-left:1px;margin-top: 40px">
                        
                        <tr >
                            
                            <td >   <div  style="background-color:yellow;height:25px;color: red;text-align: center;width: 255px;margin-top: -10% " ><!--span class="blink blink-furiously blink-infinite"--><s:a  href="#" onclick="callform1()"> <span class="blink blink-furiously blink-infinite"> Enter the Details of Found Child</span></s:a><!--/span--></div> </td>
                            
                        </tr>
                        
                        <tr><td></td></tr>
                        <tr><td></td></tr>   
                        <tr><td></td></tr>
                       
                        <tr><td>

                                <button id="cwcbtn" style="background-color:#eee;width:114px;height:140px">&nbsp;&nbsp;<img src="images_login/cwc.jpg" height="100" width="100" style="margin-top: -20px"/><br/>CWC Login</button>

                            </td></tr>
                        <tr><td>
                                <button id="dcpubtn" style="background-color:#eee;width:114px;height:140px;margin-left:140px;margin-top:-143px ">&nbsp;&nbsp;<img src="images_login/dcpu.jpg" height="100" width="100" style="margin-top: -20px"/><br/>DCPU Login<br/></button>


                            </td></tr>
                        <tr><td>
                                <!--button onclick="callform1()" style="background-color:#eee;width:114px;height:140px">&nbsp;&nbsp;&nbsp;<img src="images_login/child.jpg" height="100" width="100"/>CNCP<br/></button-->
                                <button  id="ccibtn" style="background-color:#eee;width:114px;height:140px">&nbsp;&nbsp;&nbsp;<img src="images_login/CCL_Login.png" height="100" width="100" style="margin-top: -20px"/><br/>CCI<br/></button>
                                
                            </td></tr>

                        <tr><td>

                               <button  id="cclbtn" style="background-color:#eee;width:114px;height:140px;margin-left:140px;margin-top:-142px">&nbsp;&nbsp;&nbsp;<img src="images_login/childccl.jpg" height="100" width="100" style="margin-top: -20px"/><br/>JJB Login<br/></button>
                            </td></tr>
                        <!--tr><td>

                                <button id="ccibtn" style="background-color:#eee;width:254px;height:60px;margin-left:2px;margin-top:5px">&nbsp;<img src="images_login/CCL_Login.png" height="50" width="150"/>CCI<br/></button>
                            </td></tr-->
                    </table>
                </td></tr>
            </table>

            <div id="right-cwc" class="login_window">
                <!-- <div style="width: 200px;height: 10px;margin: 18px 0 0 0"></div> -->
                <div  class="container" style="width: 200px; background-color:#aliceblue;margin-top:110px;margin-left:1px">
                    <div class="container" style="background-color:gray;height:36px;width:215px;margin-left:-16px;margin-top:40px"><h2><span id="logintext" style="color:white"><font size="5pt">CWC</font></span>&nbsp;&nbsp;&nbsp;<span style="color:white"><font size="5pt"><s:text name="global.label.login"/></font></span><s:property value="chfcdtoList.get(0).education"/></h2></div>
                    <!--<span style="margin-left:53px"><img src="photos/Login_image.png"></span> -->
                    <form method="post" action="ValidateLoginAction" name="indexForm1" id="indexForm1" style="margin-left:-10px; margin-top:32px" >
                        <span class="fa fa-user" style="font-size:19px;margin-left:8px"></span><span style="margin-left:5px"><s:text name="global.index1.username"/></span><font color="red">*</font><span  style="margin-left:7px"><input type="text" name="userId_txt" id="userId_txt2" key="global.homeID" size="17"/></span><br />
                        <span class="fa fa-key" style="font-size:16px;margin-left:8px "></span><span style="margin-left:5px"><s:text name="global.index1.password"/></span><font color="red">*</font><span  style="margin-left:7px"><input type="password" name="passwd_txt" id="passwd_txt2" size="17"/></span><br/>
                        <span><font color="red"><i><s:property value="message" escape="false"/></i></font></span>
                        <br/>                           
                        <input type="submit" style="margin-left: 118px;background-color:gray;color:white" value="<s:text name="global.butt.label"/>" onclick="return validate();"/>
                    </form>
                    &nbsp;&nbsp;&nbsp;&nbsp;<a href="#"><s:text name="global.label.forgotPass"/></a>
                </div>
            </div>  

            <div id="right-ccl" class="login_window">
               
                <div  class="container" style="width: 200px; background-color:#aliceblue;margin-top:110px;margin-left:1px">
                    <div class="container" style="background-color:gray;height:36px;width:215px;margin-left:-16px;margin-top:40px"><h2><span id="logintext" style="color:white"><font size="5pt">JJB</font></span>&nbsp;&nbsp;&nbsp;<span style="color:white"><font size="5pt"><s:text name="global.label.login"/></font></span><s:property value="chfcdtoList.get(0).education"/></h2></div>
                    
                    <form method="post" action="ValidateLoginAction" name="indexForm1" id="indexForm1" style="margin-left:-10px; margin-top:32px" >
                        <span class="fa fa-user" style="font-size:19px;margin-left:8px"></span><span style="margin-left:5px"><s:text name="global.index1.username"/></span><font color="red">*</font><span  style="margin-left:7px"><input type="text" name="userId_txt" id="userId_txt2" key="global.homeID" size="17"/></span><br />
                        <span class="fa fa-key" style="font-size:16px;margin-left:8px "></span><span style="margin-left:5px"><s:text name="global.index1.password"/></span><font color="red">*</font><span  style="margin-left:7px"><input type="password" name="passwd_txt" id="passwd_txt2" size="17"/></span><br/>
                        <span><font color="red"><i><s:property value="message" escape="false"/></i></font></span>
                        <br/>                           
                        <input type="submit" style="margin-left: 118px;background-color:gray;color:white" value="<s:text name="global.butt.label"/>" onclick="return validate();"/>
                    </form>
                    &nbsp;&nbsp;&nbsp;&nbsp;<a href="#"><s:text name="global.label.forgotPass"/></a>
                </div>
            </div>  

            <div id="right-dcpu" class="login_window">
                
                <div  class="container" style="width: 200px; background-color:aliceblue;margin-top:110px;margin-left:1px">
                    <div class="container" style="background-color:gray;height:36px;width:215px;margin-left:-16px;margin-top:40px"><h2><span id="logintext" style="color:white"><font size="5pt">DCPU</font></span>&nbsp;&nbsp;&nbsp;<span style="color:white"><font size="5pt"><s:text name="global.label.login"/></font></span><s:property value="chfcdtoList.get(0).education"/></h2></div>
                   
                    <form method="post" action="ValidateLoginAction" name="indexForm1" id="indexForm1" style="margin-left:-10px; margin-top:32px" >
                        <span class="fa fa-user" style="font-size:19px;margin-left:8px"></span><span style="margin-left:5px"><s:text name="global.index1.username"/></span><font color="red">*</font><span  style="margin-left:7px"><input type="text" name="userId_txt" id="userId_txt2" key="global.homeID" size="17"/></span><br />
                        <span class="fa fa-key" style="font-size:16px;margin-left:8px "></span><span style="margin-left:5px"><s:text name="global.index1.password"/></span><font color="red">*</font><span  style="margin-left:7px"><input type="password" name="passwd_txt" id="passwd_txt2" size="17"/></span><br/>
                        <span><font color="red"><i><s:property value="message" escape="false"/></i></font></span>
                        <br/>                           
                        <input type="submit" style="margin-left: 118px;background-color:gray;color:white" value="<s:text name="global.butt.label"/>" onclick="return validate();"/>
                    </form>
                    &nbsp;&nbsp;&nbsp;&nbsp;<a href="#"><s:text name="global.label.forgotPass"/></a>
                </div>
            </div>  
                
                <div id="right-cci" class="login_window">
                <!-- <div style="width: 200px;height: 10px;margin: 18px 0 0 0"></div> -->
                <div  class="container" style="width: 200px; background-color:aliceblue;margin-top:110px;margin-left:1px">
                    <div class="container" style="background-color:gray;height:36px;width:215px;margin-left:-16px;margin-top:40px"><h2><span id="logintext" style="color:white"><font size="5pt">CCI</font></span>&nbsp;&nbsp;&nbsp;<span style="color:white"><font size="5pt"><s:text name="global.label.login"/></font></span><s:property value="chfcdtoList.get(0).education"/></h2></div>
                    <!--<span style="margin-left:53px"><img src="photos/Login_image.png"></span> -->
                    <form method="post" action="ValidateLoginAction" name="indexForm1" id="indexForm1" style="margin-left:-10px; margin-top:32px" >
                        <span class="fa fa-user" style="font-size:19px;margin-left:8px"></span><span style="margin-left:5px"><s:text name="global.index1.username"/></span><font color="red">*</font><span  style="margin-left:7px"><input type="text" name="userId_txt" id="userId_txt2" key="global.homeID" size="17"/></span><br />
                        <span class="fa fa-key" style="font-size:16px;margin-left:8px "></span><span style="margin-left:5px"><s:text name="global.index1.password"/></span><font color="red">*</font><span  style="margin-left:7px"><input type="password" name="passwd_txt" id="passwd_txt2" size="17"/></span><br/>
                        <span><font color="red"><i><s:property value="message" escape="false"/></i></font></span>
                        <br/>                           
                        <input type="submit" style="margin-left: 118px;background-color:gray;color:white" value="<s:text name="global.butt.label"/>" onclick="return validate();"/>
                    </form>
                    &nbsp;&nbsp;&nbsp;&nbsp;<a href="#"><s:text name="global.label.forgotPass"/></a>
                </div>
            </div>  
                
                
                <div>
                    
                    <div class="sticky-container">
    <ul class="sticky">
        <li>
            <img src="images/facebook-circle.png" width="32" height="32">
            <p><a href="https://www.facebook.com/codexworld" target="_blank">Facebook</a></p>
        </li>
        <li>
            <img src="images/twitter-circle.png" width="32" height="32">
            <p><a href="https://twitter.com/codexworldblog" target="_blank">Twitter</a></p>
        </li>
        <li>
            <img src="images/gplus-circle.png" width="32" height="32">
            <p><a href="https://plus.google.com/codexworld" target="_blank">Google+</a></p>
        </li>
        <li>
            <img src="images/linkedin-circle.png" width="32" height="32">
            <p><a href="https://www.linkedin.com/company/codexworld" target="_blank">LinkedIn</a></p>
        </li>
        <li>
            <img src="images/youtube-circle.png" width="32" height="32">
            <p><a href="http://www.youtube.com/codexworld" target="_blank">YouYube</a></p>
        </li>
        <li>
            <img src="images/pin-circle.png" width="32" height="32">
            <p><a href="https://www.pinterest.com/codexworld" target="_blank">Pinterest</a></p>
        </li>
    </ul>
</div>
                    
                    
                    
                </div>
                
                
            <div class="container" style="width:470px;height:18px;margin-left:20px;margin-top: 30px">
                <s:a href="CWC_Meetings38Formde" target="_blank"><u>APPLICATION FOR FIT FACILITY INCLUDING GROUP FOSTER CARE</u></s:a>
                <br/><span class="blink blink-furiously blink-infinite" style="color:blue"> LIVE UPDATES: </span>
                <br/><span style="color:green"> NO OF HOMES: </span><span class="badge badge-info">38</span><span style="color:green;margin-left: 9%">&emsp;&nbsp; OUR CENTRES: </span><span class="badge badge-info">31</span>
                
                <br/>
                <table>
                    <tr>
                    <td><span style="color:green"> CHILDREN ADMITTED </span></td>
                    <td>:<span class="badge badge-info">200</span></td>
                   
                    <td><span style="color:green"> CHILDREN DISCHARGED </span></td>
                    <td>:<span class="badge badge-info">50</span></td>  
                    </tr>
                </table>
            </div>
        </div>         
        <div class="clear"></div>
        <div id="bottom-right-container"></div> 
        <div id="footer-centre" class="container-fluid">
            <p style="color: #BDC5ED;text-align: center ">&copy; 2017 Department of Women Development and Child Welfare  . All rights reserved.
                <br />
                <a href="http://www.cdachyd.in"><span style="color:blue"><s:text name="global.footer.powCDAC"/></span></a></p>
        </div>  
    </body>
</html>
