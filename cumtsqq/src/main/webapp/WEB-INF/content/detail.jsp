<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>Happy 购物网</title>
	<link href="css/css.css" type="text/css" rel="stylesheet">	
	<SCRIPT src="js/jquery-1.2.6.pack.js" type=text/javascript></SCRIPT>
	<SCRIPT src="js/base.js" type=text/javascript></SCRIPT>
	</head>

	<body style="text-align:center;">
	
	<h1 style="float:left";><font color="#FFCC33">Happy 购物网</font></h1>
	<div id=preview>
		<div class=jqzoom id=spec-n1 onClick="window.open('#')"><IMG height=350
		src="img/${requestScope.good_image1}" jqimg="img/${requestScope.good_image1}" width=350>
		</div>
		<div id=spec-n5>
			<div class=control id=spec-left>
				<img src="img/left.gif" />
			</div>
			<div id=spec-list>
				<ul class=list-h>
					<li><img src="img/${requestScope.good_image}"> </li>
					<li><img src="img/${requestScope.good_image1}"> </li>
					<li><img src="img/${requestScope.good_image2}"> </li>
					<li><img src="img/${requestScope.good_image}"> </li>
					<li><img src="img/${requestScope.good_image1}"> </li>
					<li><img src="img/${requestScope.good_image2}"> </li>
					<li><img src="img/${requestScope.good_image}"> </li>
					<li><img src="img/${requestScope.good_image1}"> </li>
					<li><img src="img/${requestScope.good_image2}"> </li>
				</ul>
			</div>
			<div class=control id=spec-right>
				<img src="img/right.gif" />
			</div>
			
	    </div>
	</div>
	<div style="margin-left:30%;float:left;">
	商品详情：${requestScope.good_intro};<br>
	商品价格：<font color="red">${requestScope.good_price};￥</font><br>
			  <a class="btn btn-primary" href="shop" role="button">返回首页</a>&nbsp;&nbsp;&nbsp;
	          <a class="btn btn-primary" href="save?good_id=${good.good_id}" role="button" >购物车</a>&nbsp;&nbsp;&nbsp;
	          <a class="btn btn-info" href="saveorder?good_id=${good.good_id}" role="button">购买</a> &nbsp;&nbsp;&nbsp;
	          <a class="btn btn-danger" href="savecollect?good_id=${good.good_id}" role="button">收藏</a> 
	</div>
	<SCRIPT type=text/javascript src="js/detail.js"></SCRIPT>
	
	<SCRIPT src="js/lib.js" type=text/javascript></SCRIPT>
	<SCRIPT src="js/163css.js" type=text/javascript></SCRIPT>
	
	
	</body>
</html>