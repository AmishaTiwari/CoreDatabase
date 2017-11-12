<%--
    Document   : query
    Created on : Jul 9, 2017, 1:20:16 PM
    Author     : Vishal Kumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <LINK REL=STYLESHEET href="templatemo_style.css" rel="stylesheet" type="text/css" />
        <title>Run Query</title>
		<style>
		 #load {
			position:absolute;
			width: 12px;
			height: 12px;
			top: 50%;
			left: 50%;
			margin:-6px 0 0 -6px;
			border-radius: 50%;
			-webkit-animation: middledot 2s ease-in-out infinite;
			animation: middledot 2s ease-in-out infinite;
		}

		#load:before {
			content: "";
			position: absolute;
			top: 0px;
			left: -25px;
			height: 12px;
			width: 12px;
			border-radius: 50%;
			-webkit-animation: firstdot 2s ease-in-out infinite;
			animation: firstdot 2s ease-in-out infinite;
		}

		#load:after {
			content: "";
			position: absolute;
			top: 0px;
			left: 25px;
			height: 12px;
			width: 12px;
			border-radius: 50%;
			-webkit-animation: lastdot 2s ease-in-out infinite;
			animation: lastdot 2s ease-in-out infinite;
		}

		@keyframes middledot {
			0% { background-color: rgba(36, 41, 44, .2); }
			25% { background-color: rgba(36, 41, 44, .2); }
			50% { background-color: rgba(36, 41, 44, 1); }
			75% { background-color: rgba(36, 41, 44, .2); }
			100% { background-color: rgba(36, 41, 44, .2); }
		}

		@-webkit-keyframes middledot {
			0% { background-color: rgba(36, 41, 44, .2); }
			25% { background-color: rgba(36, 41, 44, .2); }
			50% { background-color: rgba(36, 41, 44, 1); }
			75% { background-color: rgba(36, 41, 44, .2); }
			100% { background-color: rgba(36, 41, 44, .2); }
		}

		@keyframes firstdot {
			0% { background-color: rgba(36, 41, 44, .2); }
			25% { background-color: rgba(36, 41, 44, 1); }
			50% { background-color: rgba(36, 41, 44, .2); }
			75% { background-color: rgba(36, 41, 44, .2); }
			100% { background-color: rgba(36, 41, 44, .2); }
		}

		@-webkit-keyframes firstdot {
			0% { background-color: rgba(36, 41, 44, .2); }
			25% { background-color: rgba(36, 41, 44, 1); }
			50% { background-color: rgba(36, 41, 44, .2); }
			75% { background-color: rgba(36, 41, 44, .2); }
			100% { background-color: rgba(36, 41, 44, .2); }
		}

		@-webkit-keyframes lastdot {
			0% { background-color: rgba(36, 41, 44, .2); }
			25% { background-color: rgba(36, 41, 44, .2); }
			50% { background-color: rgba(36, 41, 44, .2); }
			75% { background-color: rgba(36, 41, 44, 1); }
			100% { background-color: rgba(36, 41, 44, .2); }
		}

		@keyframes lastdot {
			0% { background-color: rgba(36, 41, 44, .2); }
			25% { background-color: rgba(36, 41, 44, .2); }
			50% { background-color: rgba(36, 41, 44, .2); }
			75% { background-color: rgba(36, 41, 44, 1); }
			100% { background-color: rgba(36, 41, 44, .2); }
		}
    </style>
    </head>
    <body>
        <div id="templatmeo_wrapper">

            <div id="templatemo_content_wrapper">


              <div id="templatemo_content">
                <div class="templatemo_box">
                  <h2> <span> </span> <center> <b>Enter Query! </b> </h2>
                  <br> <br> <center>
		<div id="download" >
		<h5> Downloading </h5>
		<div id="load"></div>
		</div>
		<div></div>
        <div id="cont1">
            <div id="dwn">
			<div id="status" > </div>
            <div id="topic" style="padding-top: 15px" >
                    <label> Topic: <label>
                    <input type="text" value="*" name="lvl1"/>
                    <button id="addLvl1"> OR </button>
                    </br>
            </div>
            <div style="padding-top: 15px" id="key1" >
                    <label> Keyword 1: <label>
                    <input type="text" value="*" name="lvl2"/>
                    <button id="addLvl2"> OR </button>
                    </br>
            </div>
            <div style="padding-top: 15px" id="key2">
                    <label> Keyword 2: <label>
                    <input type="text" value="*" name="lvl2"/>
                    <button id="addLvl3"> OR </button>
                    </br>
            </div>
                        <br/>
            <div>
                <button id="yrB">Fix Year Range</button>
            </div>
            <div id="yrR">
                <span>Year Range</span>
                <div>
                    <button id="fromYr">Fix Start Year</button>
                </div>
                <div id="fromYrInput">
                    <label>From: </label> <input style="width: 50px" type="text" value="*">
                </div>
                <div>
                    <button id="toYr">Fix End Year</button>
                </div>
                <div id="toYrInput">
                    <label>Upto: </label> <input style="width: 50px" type="text" value="*">
                </div>
            </div>
                        <br/>
            <div>
                <button id="idB">Fix Id Range</button>
            </div>
            <div id="idR">
                <span>Id Range:</span>
                <div>
                    <button id="fromId">Fix Starting Id</button>
                </div>
                <div id="fromIdInput">
                    <label>From: </label> <input style="width: 80px" type="text" value="*">
                </div>
                <div>
                    <button id="toId">Fix Ending Id</button>
                </div>
                <div id="toIdInput">
                    <label>Upto: </label> <input style="width: 80px" type="text" value="*">
                </div>
            </div>
                        <br/>
            <div>
                <button id="getData">Get Data</button>
            </div>
        </div>
            <div style="padding-top: 35px">
                <form action="process" method="post">
                    <label>Sort By:</label><select id="sort" name="sort" disabled>
                        <option value="3">Relevence</option>
                        <option value="1">Year</option>
                        <option value="2">Id</option>
                    </select>
                    <input type="textarea" name="topics" id="topics" style="display: none">
                    <input type="textarea" name="keys1" id="keys1" style="display: none">
                    <input type="textarea" name="keys2" id="keys2" style="display: none">
                    <input type="textarea" name="json" id="response" style="display: none">
                    <input type="textarea" name="repo" id="repo" style="display: none">
                    <input type="submit" value="Refine" id="refine" disabled>
                </form>
            </div>

        </div></center>
                </div></div></div></div>
        <script src="js/jquery.min.js"></script>
        <script type="text/javascript">
        //function openInNewTab(url) {
            $(document).ready(function(){
                $("#dwn").find("input").on('focus',function(){
                    if($(this).val().trim()==="*"){
                        $(this).val("");
                    }
                });
                $("#dwn").find("input").on('blur',function(){
                    var x= $(this).val();
                    if(x.trim()===""){
                        $(this).val("*");
                    }
                })
                $("#fromIdInput").hide();
                $("#toIdInput").hide();
                $("#idR").hide();
                $("#idB").on('click',function(){
                    $(this).closest("div").hide();
                    $("#idR").show();
                });
                $("#fromId").on('click',function(){
                    $(this).closest("div").hide();
                    $("#fromIdInput").show();
                });
                $("#toId").on('click',function(){
                    $(this).closest("div").hide();
                    $("#toIdInput").show();
                });
                
                $("#fromYrInput").hide();
                $("#toYrInput").hide();
                $("#yrR").hide();
                $("#yrB").on('click',function(){
                    $(this).closest("div").hide();
                    $("#yrR").show();
                });
                $("#fromYr").on('click',function(){
                    $(this).closest("div").hide();
                    $("#fromYrInput").show();
                });
                $("#toYr").on('click',function(){
                    $(this).closest("div").hide();
                    $("#toYrInput").show();
                });
                
                $("#download").hide();
                $( document ).ajaxStart(function(){
                    $("#download").show();
                });
                $(document).ajaxStop(function(){
                    $("#download").hide();
                });
                $("#addLvl1").on('click',function(){
                    var input = "<span> OR </span><input type='text'value='*' name = 'topic'>";
                    $(this).before(input);
                });
                $("#addLvl2").on('click',function(){
                    var input = "<span> OR </span><input type='text' value='*' name = 'key1'>";
                    $(this).before(input);
                });
                $("#addLvl3").on('click',function(){
                    var input = "<span> OR </span><input type='text' value='*' name = 'key2'>";
                    $(this).before(input);
                });
                $("#getData").on('click',function(){
                    $("#download").show();
                    var topic = [];
                    var ind=0;
                    $("#topic :input").each(function(){
                            topic[ind]=$(this).val();
                            ind++;
                    });
                    var len = topic.length;
                    var urlT = "";
                    var topics = topic[0];
                    urlT = "( "+topic[0].trim().split(/\s+/g).join(" AND ")+" ) ";
                    for(var i=1 ; i<len-1;i++){
                        var foo = topic[i].trim().split(/\s+/g).join(" AND ");
                //        alert(foo);
                        topics = topics + "@" + foo;
                        urlT = urlT + "OR ( "+topic[i]+ ")";
                    }
                    $("#topics").val(topics);
                    var key1 = [];
                    var urlk1 = "";
                    ind=0;
                    $("#key1 :input").each(function(){
                            key1[ind]=$(this).val();
                            ind++;
                    });
                    var len = key1.length;
                    var keys1 = key1[0];
                    urlk1 = "( "+key1[0].trim().split(/\s+/g).join(" AND ")+" ) ";
                    for(var i=1 ; i<len-1;i++){
                        keys1 = keys1 + "@" + key1[i];
                        urlk1 = urlk1 + "OR ( "+key1[i].trim().split(/\s+/g).join(" AND ")+ ")";
                    }
                    $("#keys1").val(keys1);
                    var key2 = [];
                    ind=0;
                    $("#key2 :input").each(function(){
                            key2[ind]=$(this).val();
                            ind++;
                    });
                    var urlk2 = "";
                    var len = key2.length;
                    var keys2 = key2[0];
                    urlk2 = "( "+key2[0]+" ) ";
                    for(var i=1 ; i<len-1;i++){
                        keys2 = keys2 + "@" + key2[i];
                        urlk2 = urlk2 + "OR ( "+key2[i]+ ")";
                    }
                    $("#keys2").val(keys2);
                //    alert(urlT);
                //    alert(urlk1);
                //    alert(urlk2);
                    var qry = "(( "+urlT+ " ) AND ( "+urlk1+ " ) AND ( "+urlk2+ " ) AND ( language.code: en ) )";
                    var yrS = $("#fromYrInput").find("input").val().trim();
                    var yrE = $("#toYrInput").find("input").val().trim();
                    if(yrS ==="") yrS="*";
                    if(yrE==="") yrE="*";
                    if(yrS!=="*"||yrE!=="*")
                        qry = qry + " AND ( year: [ "+ yrS+ " TO "+yrE + " ] )";
                    
                    var idS = $("#fromIdInput").find("input").val().trim();
                    var idE = $("#toIdInput").find("input").val().trim();
                    if(idS==="") idS="*";
                    if(idE==="") idE="*";
                    if(idS!=="*"||idE!=="*")
                            qry = qry + " AND ( id: [ "+ idS+ " TO "+idE + " ] )";
                    
                    
                    var start= "https://core.ac.uk/api-v2/articles/search/(";
                    var end1 = ")?page=";
                    var end2 = "&pageSize=100&metadata=true&fulltext=false&citations=false&similar=false&duplicate=false&urls=false&faithfulMetadata=false&apiKey=vj8A01krVCwOd34DHoX2Yp5yTUiamthl";
                //    alert(qry);
                    var json ;
                    var Data;
                    var totalHits=0;
                    var status = "OK";
                    var data1= [];
                    var maxP = 2;
                    var maxR = maxP*100;
                    var cur=0;
                    var total = 0;
                    $.ajaxSetup({
			                 async: false
                    });
                    $("#status").html("Downloading ...");
                    var cont = true;
                    for(var i=0;i<maxP&&cont;i++){

                        var url = start + qry + end1+(i+1).toString()+end2;
                        $("#status").html("<div id='load'></div>");
                    var x=$.getJSON(url,function(data){
                        if (data.status==='OK'){
                            totalHits = data.totalHits;
                            cur = cur + (data.data).length;
                            data1 = data1.concat(data.data);
                            if(cur >= totalHits){
                                cont = false;
                            }
                        }
                    });
                }
                alert('done');
                var len = data1.length;
                for(var i1=0;i1<len;i1++){
                    var l1 = data1[i1]["authors"].length;
                    for(var i2=0;i2<l1;i2++){
                        var strng = data1[i1]["authors"][i2];
                        var cnt2 = (strng.match(/,/g) || []).length;
                        if(cnt2>1){
                            data1[i1]["authors"][i2] = strng.replace(/,/g," ");
                        }
                    }
                }
                Data = {'status':status,'totalHits':totalHits,'data':data1};
                
              //  alert(len);
                var rep="";
                if(len>0){
                    var x = data1[0]["repositories"];
                    if(x.length>0){
                        rep = x[0]["name"]===null?" ":x[0]["name"].replace("@","_at_");
                       // alert(x[0]["name"]);
                    } else{
                        rep = " ";
                    }
                }
             //   alert(rep);
                var se;
                for(var qq = 1;qq<len;qq++){
                    rep = rep + "#@#"
                    var x = data1[qq]["repositories"];
                    if(x.length>0){
                        rep = rep + (x[0]["name"]===null?" ":x[0]["name"].replace(/@/g,"_at_"));

                        //alert(x[0]["name"]);
                    } else{
                        rep = rep + " ";
                    }
                    //alert(rep);
                    se = rep;
                }
                //alert(se);
                json = JSON.stringify(Data);
                json.replace(/%/g,"percent");
                json.replace(/$/g,"USD");
                json=json.replace(/@/g,"_at_");
                //se=se.replace("@","_at_");
                $("#status").html("Downloaded...");
                $("#response").val(json);
                $("#repo").val(se);
                $("#refine").prop('disabled', false);
                $("#sort").prop('disabled', false);
                });
            });
        </script>
    </body>
</html>
