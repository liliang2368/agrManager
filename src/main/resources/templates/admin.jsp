<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>小萌神后台管理</title>
<link rel="stylesheet" type="text/css" href="js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="js/easyui/themes/icon.css">
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>   
<script type="text/javascript" src="js/easyui/jquery.easyui.min.js"></script>  
<script type="text/javascript" src="js/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
var dt=[{
	text:'商品管理',
	iconCls:'icon-sum',
	state:'open',
	children:[{
		text:'添加菜品',
		url:'food.jsp'
	},{
		text:'订单管理',
		url:'bill.jsp'
	},{
		text:'菜品分类管理',
		url:'foodtype.jsp'
	}
	]
},{
	text:'财务管理',
	iconCls:'icon-more',
	children:[{
		text:'每日营业统计',
	},{
		text:'每日销售报表'
	}]
},{
	text:'管理用户',
	iconCls:'icon-more',
	children:[{
		text:'会员中心'
	}]
}];

//侧栏菜单点击事件
function onMenuSelect(item){
	if($('#tt').tabs('exists',item.text)){
		$('#tt').tabs('select',item.text)
	}else{
		$('#tt').tabs('add',{
			title:item.text,
			content:"?????",
			closable:true,
			href:item.url
		});
	}
}
</script>
</head>
<body>
<div class="easyui-layout" style="width:700px;height:350px;" data-options="fit:true">
		<div data-options="region:'north'" style="height:50px"></div>
		<div data-options="region:'south',split:true" style="height:50px;"></div>
		<div class="easyui-sidemenu" data-options="region:'west',split:true,data:dt,onSelect:onMenuSelect" 
		title="菜单栏" style="width:250px;"></div>
		<div class="easyui-tabs" data-options="region:'center'" id="tt">
		<div title="首页"></div>
		</div>
</div>
</body>
</html>