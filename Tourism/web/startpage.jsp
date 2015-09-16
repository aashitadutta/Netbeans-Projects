

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Tourism</title>
<meta charset="utf-8"/>
<meta name = "viewport" content ="width=device-width, initial-scale = 1.0">
<link href = "bootstrap-3.3.5-dist/css/bootstrap.css" rel="stylesheet">
<link href = "bootstrap-3.3.5-dist/css/style.css" rel = "stylesheet">
<link href = "style.css" rel = "stylesheet">
</head>
<body>
<div class = "navbar navbar-inverse navbar-static-top" style = "margin:0px">
	<div class = "container">
		<a href = "#" class = "navbar-brand"> My Site</a>
		<button class = "navbar-toggle" data-toggle = "collapse" data-target = ".navHeaderCollapse">
			<span class = "icon-bar"></span>
			<span class = "icon-bar"></span>
			<span class = "icon-bar"></span>
		</button>
		<div class = "collapse navbar-collapse navHeaderCollapse">
			<ul class = " nav navbar-nav navbar-right">
				<li class = "active"><a href = "#">Home</a></li>
               
				<li><a href = "#">Login</a></li>
				<li><a href = "index1.jsp">Register</a></li>
				<li><a href = "#">Profile</a></li>
                                <li><a href = "#">Logout</a></li>
			</ul>
		</div>
	</div>
</div>
<div id = "home" class  = "home">
	<div class = "text-vcenter">
		<h1> Welcome To My Page </h1>
		<h3> Lets Visit the most fantabulous places of the world </h3>
		<a href = "#gallery" class = "btn btn-default btn-lg">Continue</a>
	</div>
</div>
<div id = "gallery" class = "pad-section">
<div class = "container">
	<div class = "row">
		<div class = "col-sm-6 text-center">
			<h2> Here's the world of art depicting our culture</h2>
			<p class = "lead"> Explore our site</p> 
		</div>
	</div>
</div>
</div>
<div id = "about" class = "pad-section">
	<div class = "container">
		<div class = "row">
			<div class = "col-sm-12 text-center">
				<h3> Parallax scrolling</h3>
			    <h4>Thankyou for visiting!</h4>
			</div>
		</div>
	</div>
	</div>
<div class = "navbar navbar-default navbar-fixed-bottom">
	<div class = "container">
       <p class = "navbar-text pull-left">Site Built By AD</p>
       <a  href="#" class = "navbar-btn btn-danger btn pull-right">Subscribe on YouTube</a>
	</div>
</div>
<script src = "js/jquery.min.js"></script>
<script src = "bootstrap-3.3.5-dist/js/bootstrap.js"></script>
<script src = "//maps.google.com/maps/api/js?sensor=true"></script>
</body>
</html>

