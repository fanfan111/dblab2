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
<body>
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
                                <a href="http://localhost:8080/DBLab3/searchSupplier"><i class="fa fa-flash "></i>信息修改</a>
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
						<ul class="nav nav-second-level collapse in">
                            <li>
                                <a class="active-menu" href="http://localhost:8080/DBLab3/addShipper"><i class="fa fa-coffee"></i>新出货单</a>
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
                        <h1 class="page-head-line">出货信息登记</h1>
                        <h1 class="page-subhead-line"> </h1>

                    </div>
                </div>
                <!-- /. ROW  -->
                <div class="row">
                <div class="col-md-1 col-sm-6 col-xs-12"></div>
                <div class="col-md-5 col-sm-6 col-xs-12">
               <div class="panel panel-success">
                        <div class="panel-heading">
                        主出货单，请填写如下相应信息
                        </div>
                        <div class="panel-body">
                            <form role="form" action="insertInput" >
                            	<div class="form-group">
                                	<label>主货单编号</label>
                                   	<input id="MSnum1" class="form-control" type="text" name="MSnum" onchange="jiancha_manum()">
                                	<p id="inputid" class="help-block">请输入主货单编号</p>
                                </div>
                                 <div class="form-group">
                                	<label>销售日期</label>
                                	<input id="outdate" class="form-control" type="text" name="outdate" >
                                </div>
                                <div class="form-group">
                                	<label>收银号编号</label>
                                	<input id='Enum1' class="form-control" type="text" name="Enum" onchange="chachong_employee()">
                                	<p id="employeeid" class="help-block">请输入收银号编号</p>
                                </div>
                                <div class="form-group">
                                	<label>是否现金&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label>
                                <div class="radio"><label><input type="radio" name="ifcash"   value="1" />是</label></div>
              					 <div class="radio"><label><input type="radio" name="ifcash"  value="0" />否</label></div>
                                </div> 
                                <div class="form-group">
                                	<label>是否会员&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label>
                                <div class="radio"><label><input type="radio" name="ifmember"   value="1" />是</label></div>
              					 <div class="radio"><label><input type="radio" name="ifmember"  value="0" />否</label></div>
                                </div>
                                 <div class="form-group">
                                	<label>会员编号</label>
                                	<input id="Mnum" class="form-control" type="text" name="Mnum">
                                </div>
                                <p id="submit" class="help-block">点击登记按钮提交销售信息</p>
                                <button type="button" class="btn btn-success" onclick="checkandsubmit()">登记</button>
							</form>
							
                        </div>
                       
                 </div>
                  
             </div>
              <div class="col-md-5 col-sm-6 col-xs-12">
              <div class="panel panel-success">
                        <div class="panel-heading"> 
                        子出货单，请填写售出商品详细信息&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <button type="button" class="btn btn-success" onclick="add()">增加商品栏</button>
                        </div>
                         <div class="panel-body">
	                        <form role="form" action="insertInput" id="tb">
	                        <div id="1">
	 <div class='form-group' > <label>商品编号</label><input class='form-control'  type='text' name='Cnum' /></div>
     <div class='form-group' > <label>数量</label> <input class='form-control' type='text' name='quantity' />  </div> 
    <div class='form-group' > <label>单价</label> <input class='form-control' type='text' name='price' />  </div> 
     <div class='form-group' > <label>折扣比例</label> <input class='form-control' type='text' name='discount' />  </div> 
     <div class='form-group' > <label>金额</label> <input class='form-control' type='text' name='money' />  </div> 
     </div>
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
    <%
    String input ="<hr> <div class='form-group' > <label>商品编号</label> <input class='form-control' type='text' name='Cnum' />  </div>"
    +"<div class='form-group' > <label>数量</label> <input class='form-control' type='text' name='quantity' />  </div>"
    +"<div class='form-group' > <label>单价</label> <input class='form-control' type='text' name='price' />  </div>"
    +"<div class='form-group' > <label>折扣比例</label> <input class='form-control' type='text' name='discount' />  </div>"
    +"<div class='form-group' > <label>金额</label> <input class='form-control' type='text' name='money' />  </div>";
    
    %>
    <script type="text/javascript">
    var id=2;
    
    function add() {
        var trObj = document.createElement("div");
        trObj.id = id;
        id = id+1;
        trObj.innerHTML = "<%=input %>";
        document.getElementById("tb").appendChild(trObj);
    }
    function jiancha_manum(){
    	var url="http://localhost:8080/DBLab3/api/json/searchmainnum";
    	$.ajax({
			type: "post",
			url: url,
			data: {"MSnum1":$("#MSnum").val()},
			cache: false,
			async : true,
			dataType: "json",
			success: function (data ,textStatus)
			{
			   if("success"==data.state){
			   		$("#inputid").text("该入主订单编号可以使用");
			   		 return true;
			     }else{
			    	 $("#inputid").text("主订单编号已存在，请重新输入");
			            return false;
			        }
			    },
			   error:function (XMLHttpRequest, textStatus, errorThrown) {      
			        alert("请求失败！");
			    }
			 });				
    	
    }
    function chachong_employee(){
    	var url="http://localhost:8080/DBLab3/api/json/searchemployeeByname";
		$.ajax({
			type: "post",
			url: url,
			data: {"Enum":$("#Enum1").val()},
			cache: false,
			async : true,
			dataType: "json",
			success: function (data ,textStatus)
			{
			   if("success"==data.state){
			   		$("#employeeid").text("员工信息存在，输入正确");
			   		 return true;
			     }else{
			    	 $("#employeeid").text("员工信息不存在，请重新输入");
			            return false;
			        }
			    },
			   error:function (XMLHttpRequest, textStatus, errorThrown) {      
			        alert("请求失败！");
			    }
			 });					
    }
    function search_shangpin(id){
    	//Commodityid
    	var url="http://localhost:8080/DBLab3/api/json/searchCommodity";
		$.ajax({
			type: "post",
			url: url,
			data: {"Cnum":$("#Cnum1").val()},
			cache: false,
			async : true,
			dataType: "json",
			success: function (data ,textStatus)
			{
			   if("success"==data.state){
			   		$("#lala").text("商品信息存在，输入正确");
			   		 return true;
			     }else{
			    	 $("#lala").text("商品信息不存在，请先添加商品信息");
			            return false;
			        }
			    },
			   error:function (XMLHttpRequest, textStatus, errorThrown) {      
			        alert("请求失败！");
			    }
			 });		
    }
    function checkandsubmit(){
    	var commoditys = "\"commoditys\":[";
    	for(i=1;i<id;i++){
    		var commodity='{';
    		var str=i.toString();
    		var strCnum='#'+str+" input[name='Cnum']";
    		var strquantity='#'+str+" input[name='quantity']";
    		var strprice='#'+str+" input[name='price']";
    		var strdiscount='#'+str+" input[name='discount']";
    		var strmoney='#'+str+" input[name='money']";
    		
    		 $(strCnum).each(function(){commodity+="\"Cnum\":\""+$(this).val()+"\",";  });
    		 $(strquantity).each(function(){commodity+="\"quantity\":\""+$(this).val()+"\",";  });
    		 $(strprice).each(function(){commodity+="\"price\":\""+$(this).val()+"\",";  });
    		 $(strdiscount).each(function(){commodity+="\"discount\":\""+$(this).val()+"\",";  });
    		 $(strmoney).each(function(){commodity+="\"money\":\""+$(this).val()+"\"}";  });
    		 if(i!=id-1)
    		 	commoditys+=commodity+",";
    		 else commoditys+=commodity+"]";
    	}//$("input[name='rd']:checked").val();
 
    	//MainShipper(MSnum,outdate,ifcash,ifmember,Mnum,Enum);
    	var result="{"+commoditys+",\"MSnum\":\""+$("#MSnum1").val()+"\",\"outdate\":\""+$("#outdate").val()
    				+"\","+"\"ifcash\":\""+$("input[name='ifcash']:checked").val()
    					+"\",\"ifmember\":\""+$("input[name='ifmember']:checked").val()
    						+"\",\"Mnum\":\""+$("#Mnum").val()+"\",\"Enum\":\""+$("#Enum1").val()+"\"}";
    	
    	
    	
    	alert(result);
    	var url="http://localhost:8080/DBLab3/api/json/addshipper";
		$.ajax({
			type: "post",
			url: url,
			data: {"params":result},
			cache: false,
			async : true,
			dataType: "json",
			success: function (data ,textStatus)
			{
			   if("success"==data.state){
			   		$("#submit").text("添加出货单成功");
			   		 return true;
			     }else{
			    	 $("#submit").text("添加出货单失败");
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
