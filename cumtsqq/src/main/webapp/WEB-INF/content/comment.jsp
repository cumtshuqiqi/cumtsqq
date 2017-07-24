<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en" dir="ltr">

<head>

  <meta charset="utf-8">

  <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">

  <meta content="width=device-width; initial-scale=1; maximum-scale=1" name="viewport">



  <title>Happy 购物网</title>



  <meta content="Washington Botelho" name="author">

  <meta content="jQuery Raty - A Star Rating Plugin" name="description">

  <meta content="jquery,plugin,rating,raty,voto,star,staring,classificacao,classificar,votar,plugin" name="keywords">



  <link type="text/css" rel="stylesheet" href="css/application.css">



  <script type="text/javascript" src="js/jquery.min.js"></script>

  <script type="text/javascript" src="js/jquery.raty.min.js"></script>



  <link href="/favicon.ico" rel="shortcut icon" type="image/x-icon">

</head>

<body>

  <div id="wrapper">

    <header role="banner">

      <div id="logo">

        <h1><a href="#" title="jQuery Raty">Happy 购物网</a></h1>

      </div>

    </header>


	<form action="comment" method="post">
    <div id="container">

          <div class="demo">
          	<p>物流服务</p>

            <div id="function-demo" class="target-demo"></div>

            <input id="function-hint" class="hint" name="logistics" >

          </div>
           <div class="demo">
          	<p>商品质量</p>

            <div id="precision-demo" class="target-demo"></div>

            <input id="precision-hint" class="hint" name="quality">

          </div>
           <div class="demo">
          	<p>服务</p>

            <div id="server-demo" class="target-demo"></div>

            <input id="server-hint" class="hint" name="server">

          </div>
          
          <input value="${RequestScope.good_id }" name="good_id">
          <button class="btn btn-lg btn-success btn-block" type="submit" onclick="Save()">评论</button>

    </div>
	</form>


    

  </div>


  <script type="text/javascript" src="js/xingxing2.js">
 
 </script>
 
 
  <script type="text/javascript" src="js/xingxing.js">

 
    

  </script>

<script src="http://www.jq22.com/js/jq.js"></script>

