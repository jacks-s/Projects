<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pls wait...</title>
<style type="text/css">
body{
hieght:600px;
width:800px;
background-image: url("https://cdn.pixabay.com/photo/2016/12/05/10/07/dish-1883501__340.png");
background-position: center;
background-repeat: no-repeat;
background-size: contain;
}
div{
hieght:600px;
width:800px;
background-image: url("https://cdn.pixabay.com/photo/2016/12/05/10/07/dish-1883501__340.png");
background-position: center;
background-repeat: no-repeat;
background-size:cover;
}
input{
border: 1px solid green;

color:black;
text-shadow: 1px 2px 2px;
font-size: 20px;
}
input:hover{
color: chocolate;
box-shadow:5px 10px 10px red;
border-color: red;

}

</style>

</head>
<body>
    <form action="processOrder" method=post>
    
    <div align="center">
      
      <h1>Place Order </h1>
      <hr>
      <label>Food Item name : </label>
     <input type="text" placeholder="Item Name " name="foodType" id="Item_Name">
     
      <input type="submit" value="Order Now">
    
    </div>
    
    </form>
</body>
</html>