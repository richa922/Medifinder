<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@page session="false"%>
<html lang="en" manifest="developers.appcache">
<head>
<title>MediFinder | Better Information, Better Health</title>
<!-- <link rel="shortcut icon" href="..\Images\login.png" type="image/png"> -->
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-cookie/1.4.1/jquery.cookie.js"></script>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta name="description"
	content="Find doctor in my area,doctor finder,drugs finder,my health status,chemist near my home,locate medicine,locate doctor,buy medicine,">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<!-- // <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script> -->
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="resources/Frontend/Css/MediFinder.css">
<link rel="stylesheet" type="text/css"
	href="resources/Frontend/Css/styles.css">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="resources/Frontend/Css/developers.css">
<link rel="stylesheet" type="text/css"
	href="resources/Frontend/Css/services.css">
<link
	href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	rel="stylesheet">
<script src="resources/Frontend/Script/Signin.js"></script>
<script src="resources/Frontend/Script/dropdown.js"></script>
<!-- <script src="resources/Frontend/script/scripts.js"></script>
<script src="resources/Frontend/script/routes.js"></script>
 -->
<script type="text/javascript">
	jQuery(function ($) {
	    $(document).on('submit', '#searchForm', function (e) {
	        e.preventDefault();
	        $.ajax({
	            url: 'http://localhost:8080/Medical/services/search/salt/132',
	            type: 'get',
	            data: $('#searchForm').serialize(),
	            success: function (data) {
	                $.each(data, function(index){
						$( "#searchResult" ).append("<div>"+data[index].medicine_name+"</div>");
						});
	            }
	        });
	    });
	})
</script>
</head>
<body>
	<nav class="navbar navbar-trans navbar-fixed-top" role="navigation">
		<div class="container" style="width: 100%;">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#navbar-collapsible">
					<!-- <span class="sr-only">Toggle navigation</span> -->
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<!-- <a class="navbar-brand" href="#">Brand</a> -->
			</div>
			<div class="navbar-collapse collapse" id="navbar-collapsible">
				<ul class="nav navbar-nav navbar-left">
					<li><a href="#section1"
						style="color: white !important; font-weight: 400 !important;font-size=22px !important;">MediFinder</a></li>
					<li><a href="#section2">Drugs</a></li>
					<li><a href="#section3">Doctor</a></li>
					<li><a href="#section4">Pills Identifier</a></li>
					<li><a href="#section5">Symptoms Checker</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">More<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#section6">Health A-Z</a></li>
							<li class="divider"></li>
							<li><a href="medifinder.html/topstories">Top
									Stories</a></li>
							<li class="divider"></li>
							<li><a href="medifinder.html/about_us  ">About
									Us</a></li>
							<li class="divider"></li>
							<li><a href="medifinder.html/help">Help</a></li>
						</ul></li>
					<!-- <li>&nbsp;</li> -->
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#search"><i class="fa fa-search"></i></a></li>
					<li><a href="#" class="show-login" data-toggle="modal"
						data-target="#login-modal"><span
							class="glyphicon glyphicon-log-in"></span> Member Login</a></li>
					<li><a href="#" class="show-register" data-toggle="modal"
						data-target="#login-modal"><span
							class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				</ul>
	</nav>



	<div id="search">
		<button type="button" class="close">×</button>
		<form>
			<input type="search" value=""
				placeholder="Medicine, Doctor, Hospital, Diagnostic Centre..." />
			<button type="submit" class="btn btn-primary search_nav">Search</button>
		</form>
	</div>


	<!-- BEGIN # MODAL LOGIN -->
	<div class="modal fade" id="login-modal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header" align="center">
					<!-- <img class="img-circle" id="img_logo" src="../Images/login.png"> -->
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
					</button>
				</div>
				<div id="div-forms">
					<form id="login-form"
						action="<c:url value="/j_spring_security_check"></c:url>"
						method="post" role="form">
						<div class="modal-body">
							<input class="form-control" type="text"
								placeholder="Username" required id="j_username" name="j_username"> 
							<input class="form-control" type="password"
								placeholder="Password" required id="j_password" name="j_password">
							<div class="checkbox">
								<label> <input type="checkbox"> Remember me
								</label>
							</div>
						</div>
						<div class="modal-footer">
							.
							<div>
								<button type="submit" class="btn btn-primary btn-lg btn-block">Login</button>
							</div>
							<div>
								<button id="login_lost_btn" type="button"
									class="btn btn-link show-forgot-password">Lost
									Password?</button>
								<button id="login_register_btn" type="button"
									class="btn btn-link show-register">Register</button>
							</div>
						</div>
					</form>
					<!-- End # Login Form -->

					<!-- Begin | Lost Password Form -->
					<form id="forgot-form">
						<div class="modal-body">
							<label style="color: #375A7F;">Type your e-mail.</label> <input
								id="lost_email" class="form-control" type="text"
								placeholder="E-Mail" required>
						</div>
						<div class="modal-footer">
							<div>
								<button type="submit" class="btn btn-primary btn-lg btn-block">Send</button>
							</div>
							<div>
								<button id="lost_login_btn" type="button"
									class="btn btn-link show-login">Log In</button>
								<button id="lost_register_btn" type="button"
									class="btn btn-link show-register">Register</button>
							</div>
						</div>
					</form>
					<!-- End | Lost Password Form -->

					<!-- Begin | Register Form -->
					<form id="register-form">
						<div class="modal-body">
							<div id="div-register-msg">
								<div id="icon-register-msg"
									class="glyphicon glyphicon-chevron-right"></div>
								<span id="text-register-msg">Register an account.</span>
							</div>
							<input id="FirstName" class="form-control" name="FirstName"
								class="form-control" type="text" placeholder="First Name"
								class="Input" required=""> <input id="LastName"
								class="form-control" name="LastName" type="text"
								placeholder="Last Name" class="Input"> <input
								type="radio" name="Gender" value="Male" style="margin: 10px;">
							Male <input type="radio" name="Gender" value="Female"
								style="margin: 10px;"> Female <input type="radio"
								name="Gender" value="Other" style="margin: 10px;"> Other
							<input id="email" class="form-control" name="Email" type="email"
								placeholder="Email Id" class="Input" required=""
								style="margin-bottom: 8px;"> <select id="workarea"
								class="form-control" name="work_area" class="Input" required="">
								<option value="" class="none">I am ...</option>
								<option value="doctor" class="doctor">Doctor</option>
								<option value="chemist" class="chemist">Chemist</option>
								<option value="hospital" class="hospital">Hospital</option>
								<option value="diagnostic_centre" class="diagnostic">Diagnostic
									Centre</option>
							</select> <input id="Speciality" class="form-control select-workarea"
								name="Speciality" type="text" placeholder="Speciality"
								class="Input" required=""> <input id="store_name"
								class="form-control select-workarea" name="store_name"
								type="text" placeholder="Store Name" class="Input" required="">
							<input id="hospital_name" class="form-control select-workarea"
								name="hospital_name" type="text" placeholder="Hospital Name"
								class="Input" required=""> <input id="diagnostic_name"
								class="form-control select-workarea" name="diagnostic_name"
								type="text" placeholder="Diagnostic Centre Name" class="Input"
								required=""> <input id="Password" class="form-control"
								name="Password" type="password" placeholder="Password"
								class="Input" required=""> <input id="Re-Enter Password"
								class="form-control" name="Re-Enter Password" type="password"
								placeholder="Re-Enter Password" class="Input" required="">
						</div>
						<div class="modal-footer">
							<div>
								<button type="submit" class="btn btn-primary btn-lg btn-block">Register</button>
							</div>
							<div>
								<button id="register_login_btn" type="button"
									class="btn btn-link show-login">Log In</button>
								<button id="register_lost_btn" type="button"
									class="btn btn-link show-forgot-password">Lost
									Password?</button>
							</div>
						</div>
					</form>
					<!-- End | Register Form -->
				</div>
				<!-- End # DIV Form -->
			</div>
		</div>
	</div>
	<!-- END # MODAL LOGIN -->

	<!-- End Header -->

	</div>
	</div>
	</nav>
	<section class="container-fluid home" id="section1">
		<h1 class="text-center v-center" style="cursor: default;">MediFinder</h1>
		<div class="container">
			<div class="row">
				<div class="col-sm-10 col-sm-offset-2 text-center">
					<form id="searchForm">
						<div>
							<input type="text" class="search_bar"
								placeholder="Medicine, Doctor, Hospital, Diagnostic Centre"
								style="color: white;">&nbsp&nbsp
							<button onclick="submit"
								style="background-color: transparent; border-width: 0px;">
								<i class="fa fa-search fa-2x search_icon"></i>
							</button>
						</div>
					</form>
				</div>
				<div id="searchResult"></div>
			</div>
		</div>
		<div class="fullscreen-bg">
			<!-- <video loop muted autoplay poster="../Images/background20.jpg"
				class="fullscreen-bg__video">
				<source src="../video/homevideo.webm" type="video/webm">
				<source src="../video/homevideo.mp4" type="video/mp4">
				<source src="../video/homevideo.ogv" type="video/ogg">
			</video> -->
		</div>
	</section>

	<section class="container-fluid" id="section2">
		<div class="row">
			<div class="col-lg-8 col-sm-offset-2 text-center chemist">
				<h1 class="text-center" style="font-size: 4em; cursor: default;">
					Find a Chemist Shop<br> Near You
				</h1>
				<br>
				<p class="lead text-center">MediFinder has a reputation for
					trusted pharmacy advice and great value prices, offering
					professional, personalised service and health care solutions
					tailored to your individual needs. you’ll find health
					professionals who value the health of you and your family just like
					they do their own.</p>
				<br> <a href="../html/find_chemist.html"><button
						class="btn btn-primary chemist_store">Find Store Here</button></a>
			</div>
		</div>
	</section>

	<section class="container-fluid" id="section3">
		<h1 class="text-center" style="font-size: 5em; cursor: default;">Physician
			Directory</h1>
		<br>
		<div class="row">
			<div class="col-sm-6 col-lg-offset-3">
				<h3 class="text-center">Find a Doctor in Your Area</h3>
				<br>
				<p class="lead text-center">Everyday, we work on problems no one
					has dared to solve before. We’re dreamers, thinkers and do-ers
					all rolled into one. We have audaciously, galactically big dreams -
					because that’s what it takes to truly change the world and
					improve healthcare access for humanity.</p>
				<br>
				<p class="text-center">
					<a href="../html/find_doctor.html"><button
							class="btn btn-primary physician_directory">Physician
							Directory</button></a>
					<!-- <img src="../Images/login.png" class="img-responsive center-block "> -->
				</p>
			</div>
		</div>
	</section>
	<section class="container-fluid" id="section4">
		<div class="row">
			<div class="col-sm-8 col-sm-offset-2 text-center chemist">
				<h1 class="text-center"
					style="font-size: 3em; letter-spacing: 1.5px; cursor: default;">Pill
					Identifier</h1>
				<p class="lead" style="margin-top: 8%;">Having trouble
					identifying your medications? Try the Pill Identifier. You can do
					Quickly identify pills, tablets and capsules using the web's most
					comprehensive Pill Identification Wizard.</p>
				<br>
				<h3 class="lead">Search by Imprint, Shape or Color...</h3>
				<br> <a href="resources/Frontend/Html/pills_identifier.html"><button
						class="btn btn-primary pill_identifier">Pill Identifier</button></a>
			</div>
		</div>
	</section>

	<section class="container-fluid" id="section5">
		<h2 class="text-center"
			style="font-size: 4em; margin-top: 55px !important; margin-bottom: 50px !important; cursor: default;">Symptoms
			Checker</h2>
		<p class="text-center lead"
			style="margin-left: 15%; margin-right: 15%;">MediFinder designed
			the Symptom Checker to feel like a real emergency room intake
			interview, it is a computer program and not a live doctor.</p>
		<p class="lead text-center"
			style="width: 100%; margin-top: 25px !important;">Take the first
			step and see what could be causing your symptoms. Then learn about
			possible next steps...</p>
		<center>
			<a href="../html/symptoms_checker.html"><button type="submit"
					class="btn btn-primary symptoms_checker">Symptoms Checker</button></a>
		</center>
		<!-- <img src="../Images/symptoms.jpg" class="img-responsive center-block "> -->
	</section>

	<section class="container" id="section6">
		<h1 class="text-center"
			style="margin-top: 5% !important; font-size: 5em; letter-spacing: 1.5px; font-weight: 400; margin-bottom: 20px;">Health
			A-Z</h1>
		<p class="lead text-center"
			style="margin-left: 15%; margin-right: 15%;">Have a health
			concern? Find trusted information on medical conditions. Our experts
			guide you through symptoms, causes, diagnosis, and treatment options</p>
		<br>
		<center>
			<a href="../html/health_a_z.html"><button
					class="btn btn-primary health_a_z">Health A-Z</button></a>
		</center>
	</section>
	<section class="container-fluid" id="section7">
		<h1 class="text-center" style="font-size: 5em; cursor: default;">Discover
			More</h1>
		<br>
		<div class="row">
			<h3 class="text-center" style="font-size: 4em !important;"></h3>
			<br>
			<p class="lead text-center"
				style="margin-left: 10%; margin-right: 10%;">MediFinder is
				designed for mobile screens and it is fully responsive. It also
				embraces the latest solutions to make your search crisp and clean in
				high resolution devices. MediFinder includes websites, mobile
				applications and social media assets, designed to provide consumers
				and healthcare professionals with access to the most trusted health
				and wellness content tailored to meet their daily needs.</p>
			<br>
			<center>
				<a href="../app/medifinder.apk"><button class="android" download>
						Download Now</button></a>
			</center>
			<!-- <img src="../Images/login.png" class="img-responsive center-block "> -->
		</div>
	</section>

	<section class="container-fluid" id="section8">
		<div class="home-doctors  clearfix">
			<div class="container">
				<div class="row">
					<div class="col-lg-12 col-md-12 col-sm-12 ">
						<div
							class="slogan-section animated fadeInUp clearfix ae-animation-fadeInUp">
							<h1 class="text-center" style="font-size: 3em; cursor: default;">
								Meet our <span>Developers</span>
								</h2>
								<p class="text-center">Our executive leadership team brings
									an impressive depth of experience in technology, design,
									wellness, and transparency. Their commitment to best business
									practices and to our clients guides our innovations and growth.</p>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-lg-3 col-md-3 col-sm-6  text-center doc-item">
						<div
							class="common-doctor animated fadeInUp clearfix ae-animation-fadeInUp">
							<ul class="list-inline social-lists animate">
								<li><a
									href="https://plus.google.com/+SahilUpadhyayjiit/posts"
									target="_new"><i class="fa fa-google-plus"></i></a></li>
								<li><a href="https://www.facebook.com/sahil.upadhyay111"
									target="_new"><i class="fa fa-facebook"></i></a></li>
								<li><a href="https://twitter.com/sahil_upadhyay"
									target="_new"><i class="fa fa-twitter"></i></a></li>
							</ul>
							<figure>
								<img width="670" height="500"
									src="https://photos-4.dropbox.com/t/2/AAAN889MkCK4pj7wgIhlgYTrX6pkvsy1AH_60imHHm-Uig/12/203934994/jpeg/32x32/1/_/1/2/sahil.jpg/EM6ljZoBGPSDASAHKAc/5bhRuf4P4tA_qGJxAjAJBtjwcmqTmrr9iEYlVdFhgJg?size=1024x768&size_mode=2"
									class="doc-img animate attachment-gallery-post-single wp-post-image"
									alt="Sahil Upadhyay">
							</figure>

							<div class="text-content">
								<h5>Sahil Upadhyay</h5>
								<h5>
									<small>Frontend Developer</small>
								</h5>
							</div>
						</div>
					</div>
					<div class="col-lg-3 col-md-3 col-sm-6  text-center doc-item">
						<div
							class="common-doctor animated fadeInUp clearfix ae-animation-fadeInUp">
							<ul class="list-inline social-lists animate">
								<li><a
									href="https://plus.google.com/+ShashankGupta_Shanki/posts"
									target="_new"><i class="fa fa-google-plus"></i></a></li>
								<li><a
									href="https://www.facebook.com/Shashank12Gupta?fref=ts"
									target="_new"><i class="fa fa-facebook"></i></a></li>
								<li><a href="#" target="_new" style="cursor: not-allowed"><i
										class="fa fa-twitter"></i></a></li>
							</ul>
							<figure>
								<img width="670" height="500"
									src="https://photos-6.dropbox.com/t/2/AADoWK2q7970cUCi2c0TGt_Bq52fDCdw4zTuFel0d4Upng/12/203934994/jpeg/32x32/1/_/1/2/20140313_174120.jpg/EM6ljZoBGOyDASAHKAc/4w62MX-WRoU2MaNUsIkpShhJjLyrvgaLpZF_CL7iBEU?size=1024x768&size_mode=2"
									class="doc-img animate attachment-gallery-post-single wp-post-image"
									alt="Shashank">
							</figure>
							<div class="text-content">
								<h5>Shashank Gupta</h5>
								<h5>
									<small>Backend Developer</small>
								</h5>
							</div>
						</div>
					</div>
					<div class="col-lg-3 col-md-3 col-sm-6  text-center doc-item">
						<div
							class="common-doctor animated fadeInUp clearfix ae-animation-fadeInUp">
							<ul class="list-inline social-lists animate">
								<li><a
									href="https://plus.google.com/110119866059386451305/posts"
									target="_new"><i class="fa fa-google-plus"></i></a></li>
								<li><a
									href="https://www.facebook.com/richa.sharma2?fref=ts"
									target="_new"><i class="fa fa-facebook"></i></a></li>
								<li><a href="#" target="_new" style="cursor: not-allowed"><i
										class="fa fa-twitter"></i></a></li>
							</ul>
							<figure>
								<img width="670" height="500"
									src="https://scontent-cdg2-1.xx.fbcdn.net/hphotos-xfa1/v/t1.0-9/310791_3007122753455_1379461166_n.jpg?oh=149446f786ae2f46df048190529cf098&oe=5697A56E"
									class="doc-img animate attachment-gallery-post-single wp-post-image"
									alt="Richa">
							</figure>
							<div class="text-content">
								<h5>Richa Sharma</h5>
								<h5>
									<small>Backend Developer</small>
								</h5>
							</div>
						</div>
					</div>
					<div class="col-lg-3 col-md-3 col-sm-6  text-center doc-item">
						<div
							class="common-doctor animated fadeInUp clearfix ae-animation-fadeInUp">
							<ul class="list-inline social-lists animate">
								<li><a
									href="https://plus.google.com/105096220636293496177/posts"
									target="_new"><i class="fa fa-google-plus"></i></a></li>
								<li><a
									href="https://www.facebook.com/akshat.sharma.188?fref=ts"
									target="_new"><i class="fa fa-facebook"></i></a></li>
								<li><a href="https://twitter.com/Aks3800" target="_new"><i
										class="fa fa-twitter"></i></a></li>
							</ul>
							<figure>
								<img width="670" height="500"
									src="https://scontent-cdg2-1.xx.fbcdn.net/hphotos-xap1/v/t1.0-9/1014430_587781727972024_1678073751_n.jpg?oh=b2b983ee273b676f3e4b19e5562a0564&oe=569ABB17"
									class="doc-img animate attachment-gallery-post-single wp-post-image"
									alt="Akshat">
							</figure>
							<div class="text-content">
								<h5>Akshat Sharma</h5>
								<h5>
									<small>Android Developer</small>
								</h5>
							</div>
						</div>
					</div>
					<div class="visible-sm clearfix margin-gap"></div>
				</div>
			</div>
		</div>
	</section>

	<footer id="footer">
		<div class="container">
			<div class="footer_list">
				<h4>Information</h4>
				<ul class="footer_ui">
					<li><a href="../html/services.html">Services</a></li>
					<li><a href="../html/benefits.html">Benefits</a></li>
					<li><a href="#section8">Developers</a></li>
				</ul>
			</div>
			<div class="footer_list">
				<h4>Follow Us</h4>
				<ul class="footer_ui">
					<li><a href="#">Twitter</a></li>
					<li><a href="#">Facebook</a></li>
					<li><a href="#">Google+</a></li>
				</ul>
			</div>
			<div class="footer_list">
				<h4>Contact Us</h4>
				<ul class="footer_ui">
					<li><a href="#">Email</a></li>
					<li><a href="#" class="show-register" data-toggle="modal"
						data-target="#login-modal">Join Us</a></li>
					<li><a href="../html/support.html">Support</a></li>
				</ul>
			</div>
			<div class="footer_list">
				<h4>Customer Service</h4>
				<ul class="footer_ui">
					<li><a href="../html/about_us.html">About Us</a></li>
					<li><a href="../html/feedback.html">Feedback</a></li>
					<li><a href="../html/privacy_policy">Privacy Policy</a></li>
				</ul>
			</div>
		</div>
		<center>
			<h3
				style="color: #eee; font-family: sans-serif; margin-bottom: 0px; font-size: 14px; cursor: default">&copy
				Copyright 2015 MediFinder Group | All rights reserved.</h3>
		</center>
		</div>
	</footer>
</body>
</html>