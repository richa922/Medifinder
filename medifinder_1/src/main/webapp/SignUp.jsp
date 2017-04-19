
<!DOCTYPE html>
<html lang="en" manifest="developers.appcache">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style>
<head>
	<title>MediFinder.com | Better Information, Better Health </title>
	<meta charset="UTF-8">
    <meta name="description" content="Find doctor in my area,doctor finder,drugs finder,my health status,chemist near my home,locate medicine,locate doctor,buy medicine,">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="<c:url value="/resources/Css/MediFinder" />" rel="stylesheet">
    <link rel="shortcut icon" href="..\Images\Title_3.png" type="image/png">
    
	<link rel="stylesheet" type="text/css" href="../Css/font-awesome.css">
    <link rel="stylesheet" type="text/css" href="../Css/Signin.css">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
</head>    

    <script src="../Script/Signin.js"></script>
    <script src="../Script/dropdown.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function madeAjaxCall() {
		alert('I am in');
		$.ajax({
			type : "post",
			contentType : "application/json",
			url : 'http://localhost:8080/Medical/signUp/doctor',
			cache : false,
			data : JSON.stringify({
				doctor_firstname : $("#doctor_firstname").val(),
				doctor_lastname : $("#doctor_lastname").val(),
				doctor_emailId : $("#doctor_emailId").val(),
				speciality : $("#speciality").val(),
				doctor_pwd : $("#doctor_pwd").val()
			}),
			dataType : 'json'
		});
		alert('I am in 2');
	}
</script>
</head>
<body>
<nav class="navbar navbar-inverse" role="navigation">
    <div class="navbar-header">
        <a class="navbar-brand" href="../html/medifinder.html" style="cursor:default">MediFinder</a>
    </div>
    <div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="../html/medifinder.html">Home</a></li>
            <li><a href="..html//medifinder.html/drugs">Drugs</a></li>
            <li><a href="../html/medifinder.html/doctors">Doctors</a></li>
            <li><a href="../html/medifinder.html/pillsidentifier">Pills Identifier</a></li>
            <li><a href="../html/medifinder.html/symptomchecker">Symptom Checker</a></li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">More<b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a href="../html/medifinder.html/topstories">Top Stories</a></li>
                    <li class="divider"></li>
                    <li><a href="../html/medifinder.html/healtha-z">Health A-Z</a></li>
                    <li class="divider"></li>
                    <li><a href="../html/medifinder.html/physiciandirectory">Physician Directory</a></li>
                    <li class="divider"></li>
                    <li><a href="../medifinder.html/help">Help</a></li>
                </ul>
            </li>
        </ul>
    </div>
    <ul class="nav navbar-nav navbar-right">
        <li><a href="#" class="show-login" data-toggle="modal" data-target="#login-modal" ><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        <li><a href="#" class="show-register" data-toggle="modal" data-target="#login-modal" ><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
    </ul>
<!-- BEGIN # MODAL LOGIN -->
    <div class="modal fade" id="login-modal">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header" align="center">
                    <img class="img-circle" id="img_logo" src="../Images/login.png">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                    </button>
                </div>
                <div id="div-forms">
                    <form id="login-form">
                        <div class="modal-body">
                            <input id="login_username" class="form-control" type="text" placeholder="Username" required>
                            <input id="login_password" class="form-control" type="password" placeholder="Password" required>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox"> Remember me
                                </label>
                            </div>
                        </div>
                        <div class="modal-footer">.
                            <div>
                                <button type="submit" class="btn btn-primary btn-lg btn-block">Login</button>
                            </div>
                            <div>
                                <button id="login_lost_btn" type="button" class="btn btn-link show-forgot-password">Lost Password?</button>
                                <button id="login_register_btn" type="button" class="btn btn-link show-register">Register</button>
                            </div>
                        </div>
                    </form>
                    <!-- End # Login Form -->
                    
                    <!-- Begin | Lost Password Form -->
                    <form id="forgot-form">
                        <div class="modal-body">
                        <label style="color:#375A7F;">Type your e-mail.</label>
                            <input id="lost_email" class="form-control" type="text" placeholder="E-Mail" required>
                        </div>
                        <div class="modal-footer">
                            <div>
                                <button type="submit" class="btn btn-primary btn-lg btn-block">Send</button>
                            </div>
                            <div>
                                <button id="lost_login_btn" type="button" class="btn btn-link show-login">Log In</button>
                                <button id="lost_register_btn" type="button" class="btn btn-link show-register">Register</button>
                            </div>
                        </div>
                    </form>
                    <!-- End | Lost Password Form -->
                    
                    <!-- Begin | Register Form -->
                    <form id="register-form">
                        <div class="modal-body">
                            <div id="div-register-msg">
                                <div id="icon-register-msg" class="glyphicon glyphicon-chevron-right"></div>
                                <span id="text-register-msg">Register an account.</span>
                            </div>
                            <input id="FirstName" class="form-control" name="doctor_firstname" id="doctor_firstname" value="" class="form-control" type="text" placeholder="First Name" class="Input" required="">

                            <input id="LastName" class="form-control" name="LastName"name="doctor_lastname" id="doctor_lastname" value="" type="text" placeholder="Last Name" class="Input">
                           
                                <input type="radio" name="Gender" value="Male" style="margin:10px;">  Male
                                <input type="radio" name="Gender" value="Female"style="margin:10px;"> Female
                                <input type="radio" name="Gender" value="Other"style="margin:10px;">  Other
                            
<input id="email" class="form-control" name="doctor_lastname" id="doctor_lastname" value="" type="email" placeholder="Email Id" class="Input" required="">
                            <input id="Speciality" class="form-control" name="speciality" id="speciality" value="" type="text" placeholder="Speciality" class="Input" required="">
                            <input id="Password" class="form-control" name="doctor_pwd" id="doctor_pwd" value="" type="password" placeholder="Password" class="Input" required="">
                            <input id="Re-Enter Password" class="form-control" name="Re-Enter Password" type="password" placeholder="Re-Enter Password" class="Input" required="">
                        </div>
                        <div class="modal-footer">
                            <div>
                                <button type="submit" onclick="madeAjaxCall();" class="btn btn-primary btn-lg btn-block">Register</button>
                            </div>
                            <div>
                                <button id="register_login_btn" type="button" class="btn btn-link show-login">Log In</button>
                                <button id="register_lost_btn" type="button" class="btn btn-link show-forgot-password">Lost Password?</button>
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
</nav>
<footer id="footer">
  <div class="container">    
    <div class="footer_list">          
        <h4>Information</h4>
        <ul class="footer_ui">
            <li><a href="#">Services</a></li>
            <li><a href="#">Benefits</a></li>
            <li><a href="../Html/developers.html">Developers</a></li>
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
            <li><a href="#" class="show-register" data-toggle="modal" data-target="#login-modal">Join Us</a></li>
            <li><a href="#"></a></li>
            <li><a href="#">Support</a></li>
        </ul> 
    </div>
    <div class="footer_list">          
        <h4>Customer Service</h4>
        <ul class="footer_ui">
            <li><a href="#">About Us</a></li>
            <li><a href="#">Feedback</a></li>
            <li><a href="#">Privacy Policy</a></li>
        </ul> </div>
    </div></br>
    <center>
        <h3 style="color: #9e9e9e;font-family: sans-serif;font-size:14px;margin-top:-1em;cursor:default">&copy Copyright 2015 MediFinder Group | All rights reserved.</h3>
    </center>
  </div>
</footer>
</body>
</html>