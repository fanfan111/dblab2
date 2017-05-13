<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Responsive Bootstrap Advance Admin Template</title>

    <!-- BOOTSTRAP STYLES-->
    <link href="./assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONTAWESOME STYLES-->
    <link href="./assets/css/font-awesome.css" rel="stylesheet" />
    <!--CUSTOM BASIC STYLES-->
    <link href="./assets/css/basic.css" rel="stylesheet" />
    <!--CUSTOM MAIN STYLES-->
    <link href="./assets/css/custom.css" rel="stylesheet" />
    <!-- GOOGLE FONTS-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body onload="myfunction()">
    <div id="wrapper">
        <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">COMPANY NAME</a>
            </div>

            <div class="header-right">

            </div>
        </nav>
        <!-- /. NAV TOP  -->
        <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
                    <li>
                        <div class="user-img-div">
                            <img src="assets/img/user.png" class="img-thumbnail" />

                            <div class="inner-text">
                                员工编号
                            <br />
                                <small>级别</small>
                            </div>
                        </div>

                    </li>
					<li>
                        <a href="#"><i class="fa fa-yelp "></i>员工管理 <span class="fa arrow"></span></a>
                         <ul class="nav nav-second-level collapse in">
                            <li>
                                <a  href="http://localhost:8080/DBLab3/addEmployee"><i class="fa fa-coffee"></i>员工入职登记</a>
                            </li>
                            <li>
                                <a href="http://localhost:8080/DBLab3/deleteEmployee"><i class="fa fa-flash "></i>员工离职登记</a>
                            </li>
                             <li>
                                <a href="http://localhost:8080/DBLab3/searchEmployee"><i class="fa fa-key "></i>在职员工查询</a>
                            </li>
                             <li>
                                <a class="active-menu" href="http://localhost:8080/DBLab3/changeEmployee"><i class="fa fa-send "></i>修改员工信息</a>
                            </li>
                        
                           
                        </ul>
                    </li>

                    <li>
                       <a  href="http://localhost:8080/DBLab3/inputHouse"><i class="fa fa-flash "></i>入库登记</a>
                        
                    </li>
                    
                     <li>
						<a href="#"><i class="fa fa-yelp "></i>供货商管理 <span class="fa arrow"></span></a>
						<ul class="nav nav-second-level ">

							<li>
                                <a 	 href="http://localhost:8080/DBLab3/inputSupplier"><i class="fa fa-coffee"></i>添加供货商信息</a>
                            </li>
							<li>
                               <a  href="http://localhost:8080/DBLab3/searchSupplier"><i class="fa fa-coffee"></i>详情查询</a>
                           </li>
                            <li>
                                <a href="http://localhost:8080/DBLab3/changeSupplier"><i class="fa fa-flash "></i>信息修改</a>
                            </li>						
                        </ul>
						
                    </li>
					<li>
						<a href="#"><i class="fa fa-yelp "></i>商品管理 <span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li>
                                <a href="http://localhost:8080/DBLab3/addCommodity"><i class="fa fa-coffee"></i>添加商品</a>
                            </li>
							<li>
                                <a href="http://localhost:8080/DBLab3/searchCommodity"><i class="fa fa-coffee"></i>详情查询</a>
                            </li>					
                        </ul>
                    </li>
                      <li>
                        <a href="#"><i class="fa fa-yelp "></i>会员管理 <span class="fa arrow"></span></a>
						<ul class="nav nav-second-level ">
                            <li>
                                <a href="http://localhost:8080/DBLab3/addMember"><i class="fa fa-coffee"></i>新会员登记</a>
                            </li>
                            <li>
                                <a href="http://localhost:8080/DBLab3/searchMember"><i class="fa fa-flash "></i>会员信息查询</a>
                            </li> 
                        </ul>
						
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-yelp "></i>出售记录 <span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
                            <li>
                                <a href="http://localhost:8080/DBLab3/addShipper"><i class="fa fa-coffee"></i>新出货单</a>
                            </li>
                            <li>
                                <a href="http://localhost:8080/DBLab3/searchShipper"><i class="fa fa-flash "></i>出售信息查询</a>
                            </li> 
                        </ul>
                    </li>
                    <li>
                        <a  href="login.html"><i class="fa fa-square-o "></i>退出登录</a>
                    </li>
                </ul>
            </div>

        </nav>
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper">
            <div id="page-inner">
                
                <div class="row">
                    <div class="col-md-12">
                        <h1 class="page-head-line">修改员工信息</h1>
                        <h1 class="page-subhead-line"> </h1>

                    </div>
                </div>
                
                
                
                <!-- /. ROW  -->
                <div class="row">
                <div class="col-md-1 col-sm-6 col-xs-12"></div>
                <div class="col-md-6 col-sm-6 col-xs-12">
               <div class="panel panel-success">
                        <div class="panel-heading">
                           <div id="head">请输入需要修改信息员工的员工编号</div>
                        </div>
                        <div class="panel-body">
                        <script type="text/javascript">
                        function myfunction(){
	                        $('#1').attr("disabled","disabled"); 
	                        $('#1').attr("disabled","disabled"); 
				        	$('#2').attr("disabled","disabled"); 
				        	$('#3').attr("disabled","disabled"); 
				        	$('#4').attr("disabled","disabled");
				        	$('#5').attr("disabled","disabled"); 
				        	$('#6').attr("disabled","disabled");
				        	$('#7').attr("disabled","disabled"); 
				        	$('#8').attr("disabled","disabled");
				        	$('#9').attr("disabled","disabled"); 
				        	$('#10').attr("disabled","disabled");
				        	$('#11').attr("disabled","disabled"); 
				        	$('#12').attr("disabled","disabled");
				        	$('#13').attr("disabled","disabled");
				        	$('#submit_js').attr("disabled","disabled");
				        	
				        //$('#submit_js').attr("disabled","disabled");
				        	
                        }
							function searchfunction(){
								var url="http://localhost:8080/DBLab3/api/json/searchemployeeByname";
								
								$.ajax({
									type: "post",
									url: url,
									data: {"Enum":$("#enum_js").val()},
									cache: false,
									async : true,
									dataType: "json",
									success: function (data ,textStatus)
									   {
									      //alert(data);
									   	 if("success"==data.state){
									   		 $("#head").text("请修改该员工信息");
									   		$("#1").removeAttr("disabled");
									   		$("#2").removeAttr("disabled");
									   		$("#3").removeAttr("disabled");
									   		$("#4").removeAttr("disabled");
									   		$("#5").removeAttr("disabled");
									   		$("#6").removeAttr("disabled");
									   		$("#7").removeAttr("disabled");
									   		$("#8").removeAttr("disabled");
									   		$("#9").removeAttr("disabled");
									        $("#10").removeAttr("disabled");
									   		$("#11").removeAttr("disabled");
									   		$("#12").removeAttr("disabled");
									   		$("#13").removeAttr("disabled");
									   		$("#submit_js").removeAttr("disabled");
									   		
									   		$("#enum_js").val(data.Enum);
									   		$("#1").val(data.ename);
									   		
									   		if(data.sex=='男'){$("#2").prop("checked",true); }
								        	else{alert(data.sex);$("#3").prop("checked",true);}
									   		$("#4").val(data.duty);
									   		$("#5").val(data.password);
									   		if(data.level=='0'){$("input[name='level'][value=0]").attr("checked",true); }
								        	else{$("input[name='level'][value=1]").attr("checked",true);}
									   		if(data.dnum=='宣传部'){$("input[name='dnum'][value=0001]").attr("checked",true); }
								        	else if(data.dnum=='销售部'){$("input[name='dnum'][value=0002]").attr("checked",true); }
								        	else if(data.dnum=='采购部'){$("input[name='dnum'][value=0003]").attr("checked",true); }
								        	else{$("input[name='dnum'][value=0004]").attr("checked",true);}
									   		$("#12").val(data.superEnum);
									   		$("#13").val(data.idnum);
									          return true;
									     }else{
									        	$("#head").text("请检查员工编号");
									        	$('#1').attr("disabled","disabled"); 
									        	$('#2').attr("disabled","disabled"); 
									        	$('#3').attr("disabled","disabled"); 
									        	$('#4').attr("disabled","disabled");
									        	$('#5').attr("disabled","disabled"); 
									        	$('#6').attr("disabled","disabled");
									        	$('#7').attr("disabled","disabled"); 
									        	$('#8').attr("disabled","disabled");
									        	$('#9').attr("disabled","disabled"); 
									        	$('#10').attr("disabled","disabled");
									        	$('#11').attr("disabled","disabled"); 
									        	$('#12').attr("disabled","disabled");
									        	$('#13').attr("disabled","disabled");
									        	$('#submit_js').attr("disabled","disabled");
									            return false;
									        }
									    },
									   error:function (XMLHttpRequest, textStatus, errorThrown) {      
									        alert("请求失败！");
									    }
									 });						
							}
						</script>
                             <form role="form" action="changeemployee" id="test">
                            	<div class="form-group">
                                	<label>员工编号</label>
                                   	<input id="enum_js" class="form-control" type="text" name="enum"  value="" onchange="searchfunction()"/>
                                </div>
                                <div class="form-group">
                                	<label>姓名</label>
                                	<input id="1" class="form-control" type="text" name="ename"  value=""/>
                                </div>
                                <div class="form-group">
                                	<label>性别&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label>
                                	
                                <div class="radio"><label><input id="2" type="radio" name="sex"  value="男"  value=""/>男</label></div>
              					 <div class="radio"><label><input id="3" type="radio" name="sex"  value="女"  value=""/>女</label></div>
                                </div>
                                <div class="form-group">
                                	<label>职务</label>
                                	<input id="4" class="form-control" type="text" name="duty" value="">
                                </div>
                                <div class="form-group">
                                	<label>口令</label>
                                	<input id="5" class="form-control" type="password" name="password" value="">
                                </div>
                                <div class="form-group">
                                	<label>权限级别</label>
                                	 <div class="radio"><label><input id="6" type="radio" name="level"  value="0" />普通员工</label></div>
              						 <div class="radio"><label><input id="7" type="radio" name="level"  value="1" />高层员工</label></div>
                                </div>
                                <div class="form-group">
                                	<label>身份证号</label>
                                	<input id="13" class="form-control" type="text" name="idnum" value="">
                                </div>
                                <div class="form-group">
                                	<label>所属部门</label>
                                	<div class="radio"><label><input id="8" type="radio" name="dnum" value="0001" />宣传部</label></div>
              						<div class="radio"><label><input id="9" type="radio" name="dnum" value="0002" />销售部</label></div>
              						<div class="radio"><label><input id="10" type="radio" name="dnum" value="0003" />采购部</label></div>
              						<div class="radio"><label><input id="11" type="radio" name="dnum" value="0004" />后勤部</label></div>
                                </div>
                                <div class="form-group">
                                	<label>主管领导</label>
                                	<input id="12" class="form-control" type="text" name="superEnum" >
                                </div>
                                <button id="submit_js" type="submit" class="btn btn-success">修改</button>
							</form>
                        </div>
                 </div>
             </div>
</div>
            </div>
            <!-- /. PAGE INNER  -->
        </div>
        <!-- /. PAGE WRAPPER  -->
    </div>
    <!-- /. WRAPPER  -->
    <div id="footer-sec">
        &copy; 2014 YourCompany | More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
    </div>
    <!-- /. FOOTER  -->
    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
    <!-- JQUERY SCRIPTS -->
    <script src="./assets/js/jquery-1.10.2.js"></script>
    <!-- BOOTSTRAP SCRIPTS -->
    <script src="./assets/js/bootstrap.js"></script>
    <!-- METISMENU SCRIPTS -->
    <script src="./assets/js/jquery.metisMenu.js"></script>
    <!-- CUSTOM SCRIPTS -->
    <script src="./assets/js/custom.js"></script>


</body>
</html>
