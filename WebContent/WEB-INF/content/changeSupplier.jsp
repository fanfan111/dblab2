﻿<!DOCTYPE html>
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
                         <ul class="nav nav-second-level">
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
                                <a href="http://localhost:8080/DBLab3/changeEmployee"><i class="fa fa-send "></i>修改员工信息</a>
                            </li>
                        
                           
                        </ul>
                    </li>

                    <li>
                        <a href="http://localhost:8080/DBLab3/inputHouse"><i class="fa fa-flash "></i>入库登记</a>
                        
                    </li>
					 <li>
						<a href="#"><i class="fa fa-yelp "></i>供货商管理 <span class="fa arrow"></span></a>
						<ul class="nav nav-second-level  collapse in">

							<li>
                                <a 	 href="http://localhost:8080/DBLab3/inputSupplier"><i class="fa fa-coffee"></i>添加供货商信息</a>
                            </li>
							<li>
                               <a  href="http://localhost:8080/DBLab3/searchSupplier"><i class="fa fa-coffee"></i>详情查询</a>
                           </li>
                            <li>
                                <a class="active-menu" href="http://localhost:8080/DBLab3/changeSupplier"><i class="fa fa-flash "></i>信息修改</a>
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
                        <h1 class="page-head-line">供货商信息修改</h1>
                        <h1 class="page-subhead-line"> </h1>

                    </div>
                </div>
                
                <!-- /. ROW  -->
                <div class="row">
                <div class="col-md-1 col-sm-6 col-xs-12"></div>
                <div class="col-md-6 col-sm-6 col-xs-12">
               <div class="panel panel-success">
                        <div class="panel-heading">
                            <div id="head">请输入需要修改的供应商编号</div>
                        </div>
                        <div class="panel-body">
                            <form role="form" action="changesupplier">
                            	<div class="form-group">
                                	<label>供货商编号</label>
                                   	<input id="1"  class="form-control" type="text" name="Snum" onchange="searchfunction()">
                                </div>
                                <div class="form-group">
                                	<label>供应商名称</label>
                                	<input id="2" class="form-control" type="text" name="Sname">
                                </div>
                                <div class="form-group">
                                	<label>地址</label>
                                	<input id="3" class="form-control" type="text" name="address">
                                </div>
                                <div class="form-group">
                                	<label>电话号码</label>
                                	<input id="4" class="form-control" type="text" name="telephonenum">
                                </div>
                                <div class="form-group">
                                	<label>联系人</label>
                                	<input id="5" class="form-control" type="text" name="contactperson">
                                </div>
                                <button id="6" type="submit" class="btn btn-success">添加</button>
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
     <script type="text/javascript">
                        function myfunction(){
				        	$('#2').attr("disabled","disabled"); 
				        	$('#3').attr("disabled","disabled"); 
				        	$('#4').attr("disabled","disabled");
				        	$('#5').attr("disabled","disabled"); 
				        	$('#6').attr("disabled","disabled");
                        }
							function searchfunction(){
								var url="http://localhost:8080/DBLab3/api/json/searchSupplier";
								
								$.ajax({
									type: "post",
									url: url,
									data: {"Snum":$("#1").val()},
									cache: false,
									async : true,
									dataType: "json",
									success: function (data ,textStatus)
									   {
									      //alert(data);
									   	 if("success"==data.state){
									   		 $("#head").text("请修改该供货商");
									   		$("#2").removeAttr("disabled");
									   		$("#3").removeAttr("disabled");
									   		$("#4").removeAttr("disabled");
									   		$("#5").removeAttr("disabled");
									   		$("#6").removeAttr("disabled");
									   	
									   		$("#1").val(data.Snum);
									   		$("#2").val(data.Sname);
									   		$("#3").val(data.address);
									   		$("#4").val(data.telephonenum);
									   		$("#5").val(data.contactperson);
									   		
									          return true;
									     }else{
									        	$("#head").text("请检查供货商编号");
									        	$('#2').attr("disabled","disabled"); 
									        	$('#3').attr("disabled","disabled"); 
									        	$('#4').attr("disabled","disabled");
									        	$('#5').attr("disabled","disabled"); 
									        	$('#6').attr("disabled","disabled");
									            return false;
									        }
									    },
									   error:function (XMLHttpRequest, textStatus, errorThrown) {      
									        alert("请求失败！");
									    }
									 });						
							}
						</script>
    
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
