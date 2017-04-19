// magic.js
$(document)
		.ready(
				function() {

					// process the form
					/*
					 * $('#register-form').submit(function(event) {
					 * console.log("Form SignUp");
					 * 
					 * $('.form-group').removeClass('has-error'); // remove the
					 * error class $('.help-block').remove(); // remove the
					 * error text
					 *  // get the form data // there are many ways to get this
					 * data using jQuery (you can use the class or id also) var
					 * SignUpFormData = { 'FirstName' :
					 * $('input[name=FirstName]').val(), 'LastName' :
					 * $('input[name=LastName]').val(), 'Gender' :
					 * $('input[name=Gender]').val(), 'Email' :
					 * $('input[name=Email]').val(), 'WorkArea' :
					 * $('input[name=WorkArea]').val(), 'Speciality' :
					 * $('input[name=Speciality]').val(), 'StoreName' :
					 * $('input[name=StoreName]').val(), 'HospitalName' :
					 * $('input[name=HospitalName]').val(), 'DiagnosticName' :
					 * $('input[name=DiagnosticName]').val(), 'Password' :
					 * $('input[name=Password]').val(), }; // process the form
					 * $.ajax({ type : 'POST', // define the type of HTTP verb
					 * we want to use (POST for our form) url :
					 * '../Html/process.php', // the url where we want to POST
					 * data : SignUpFormData, // our data object dataType :
					 * 'json', // what type of data do we expect back from the
					 * server encode : true }) // using the done promise
					 * callback .done(function(data) {
					 *  // log data to the console so we can see
					 * console.log(data);
					 *  // here we will handle errors and validation messages if ( !
					 * data.success) {
					 *  // handle errors for name --------------- if
					 * (data.errors.name) {
					 * $('#name-group').addClass('has-error'); // add the error
					 * class to show red input $('#name-group').append('<div
					 * class="help-block">' + data.errors.name + '</div>'); //
					 * add the actual error message under our input }
					 *  // handle errors for email --------------- if
					 * (data.errors.email) {
					 * $('#email-group').addClass('has-error'); // add the error
					 * class to show red input $('#email-group').append('<div
					 * class="help-block">' + data.errors.email + '</div>'); //
					 * add the actual error message under our input }
					 *  // handle errors for superhero alias --------------- if
					 * (data.errors.superheroAlias) {
					 * $('#superhero-group').addClass('has-error'); // add the
					 * error class to show red input
					 * $('#superhero-group').append('<div class="help-block">' +
					 * data.errors.superheroAlias + '</div>'); // add the
					 * actual error message under our input }
					 *  } else {
					 *  // ALL GOOD! just show the success message!
					 * $('form').append('<div class="alert alert-success">' +
					 * data.message + '</div>');
					 *  // usually after form submission, you'll want to
					 * redirect // window.location = '/thank-you'; // redirect a
					 * user to another page
					 *  } })
					 *  // using the fail promise callback .fail(function(data) {
					 *  // show any errors // best to remove for production
					 * console.log(data); });
					 *  // stop the form from submitting the normal way and
					 * refreshing the page event.preventDefault(); });
					 */

					// SignIn Form
					/*
					 * $('#login-form').submit(function(event) {
					 * console.log("login");
					 * $('.form-group').removeClass('has-error'); // remove the
					 * error class $('.help-block').remove(); // remove the
					 * error text // get the form data // there are many ways to
					 * get this data using jQuery (you can use the class or id
					 * also) var LoginFormData = { 'UserName' :
					 * $('input[name=UserName]').val(), 'Password' :
					 * $('input[name=Password]').val(), }; // process the form
					 * $.ajax({ type : 'POST', // define the type of HTTP verb
					 * we want to use (POST for our form) url :
					 * '../Html/process.php', // the url where we want to POST
					 * data : LoginFormData, // our data object dataType :
					 * 'json', // what type of data do we expect back from the
					 * server encode : true }) // using the done promise
					 * callback .done(function(data) {
					 *  // log data to the console so we can see
					 * console.log(data);
					 *  // here we will handle errors and validation messages if ( !
					 * data.success) {
					 *  // handle errors for username --------------- if
					 * (data.errors.UserName) {
					 * $('#name-group').addClass('has-error'); // add the error
					 * class to show red input $('#name-group').append('<div
					 * class="help-block">' + data.errors.UserName + '</div>'); //
					 * add the actual error message under our input }
					 *  // handle errors for password --------------- if
					 * (data.errors.password) {
					 * $('#email-group').addClass('has-error'); // add the error
					 * class to show red input $('#email-group').append('<div
					 * class="help-block">' + data.errors.password + '</div>'); //
					 * add the actual error message under our input }
					 *  } else {
					 *  // ALL GOOD! just show the success message!
					 * $('form').append('<div class="alert alert-success">' +
					 * data.message + '</div>');
					 *  // usually after form submission, you'll want to
					 * redirect // window.location = '/thank-you'; // redirect a
					 * user to another page
					 *  } })
					 *  // using the fail promise callback .fail(function(data) {
					 *  // show any errors // best to remove for production
					 * console.log(data); });
					 *  // stop the form from submitting the normal way and
					 * refreshing the page event.preventDefault(); });
					 */

					// Forget Password Form
					$('#forgot-form')
							.submit(
									function(event) {
										console.log("Forget form");
										$('.form-group').removeClass(
												'has-error'); // remove the
																// error class
										$('.help-block').remove(); // remove
																	// the error
																	// text

										// get the form data
										// there are many ways to get this data
										// using jQuery (you can use the class
										// or id also)
										var ForgotFormData = {
											'UserEmail' : $(
													'input[name=UserEmail]')
													.val(),
										};
										// process the form
										$
												.ajax({
													type : 'POST', // define
																	// the type
																	// of HTTP
																	// verb we
																	// want to
																	// use (POST
																	// for our
																	// form)
													url : 'link.py', // the
																		// url
																		// where
																		// we
																		// want
																		// to
																		// POST
													data : ForgetFormData, // our
																			// data
																			// object
													dataType : 'json', // what
																		// type
																		// of
																		// data
																		// do we
																		// expect
																		// back
																		// from
																		// the
																		// server
													encode : true
												})
												// using the done promise
												// callback
												.done(
														function(data) {

															// log data to the
															// console so we can
															// see
															console.log(data);

															// here we will
															// handle errors and
															// validation
															// messages
															if (!data.success) {

																// handle errors
																// for username
																// ---------------
																if (data.errors.UserName) {
																	$(
																			'#name-group')
																			.addClass(
																					'has-error'); // add
																									// the
																									// error
																									// class
																									// to
																									// show
																									// red
																									// input
																	$(
																			'#name-group')
																			.append(
																					'<div class="help-block">'
																							+ data.errors.UserName
																							+ '</div>'); // add
																											// the
																											// actual
																											// error
																											// message
																											// under
																											// our
																											// input
																}

																// handle errors
																// for password
																// ---------------
																if (data.errors.password) {
																	$(
																			'#email-group')
																			.addClass(
																					'has-error'); // add
																									// the
																									// error
																									// class
																									// to
																									// show
																									// red
																									// input
																	$(
																			'#email-group')
																			.append(
																					'<div class="help-block">'
																							+ data.errors.password
																							+ '</div>'); // add
																											// the
																											// actual
																											// error
																											// message
																											// under
																											// our
																											// input
																}

															} else {

																// ALL GOOD!
																// just show the
																// success
																// message!
																$('form')
																		.append(
																				'<div class="alert alert-success">'
																						+ data.message
																						+ '</div>');

																// usually after
																// form
																// submission,
																// you'll want
																// to redirect
																// window.location
																// =
																// '/thank-you';
																// // redirect a
																// user to
																// another page

															}
														})

												// using the fail promise
												// callback
												.fail(function(data) {

													// show any errors
													// best to remove for
													// production
													console.log(data);
												});

										// stop the form from submitting the
										// normal way and refreshing the page
										event.preventDefault();
									});
				});

jQuery(function($) {
	$(document)
			.on(
					'submit',
					'#searchForm',
					function(e) {
						var inputVal = $.trim($("#searchFormInputBox").val());
						if (inputVal.length <= 0) {
							alert("Please fill the search query properly");
							return false;
						}
						e.preventDefault();
						$
								.ajax({
									url : 'http://localhost:8080/Medical/services/search/salt/'
											+ inputVal,
									type : 'get',
									data : $('#searchForm').serialize(),
									success : function(data) {
										if (data == undefined || !$.trim(data)) {
											alert("Oops!!!...Please Search the Doctor, Medicine, Pills, Diagnostic Center.....");
											return false;
										}
										$
												.each(
														data,
														function(index) {
															var data1 = '';
															var data2 = '';
															var data3 = '';
															var data4 = '';

															if (data[index].length == 9) {
																data1 = data[index][1];
																data2 = data[index][5];
																data3 = data[index][4];
																// data4 =
																// data[index][7];
															}
															if (data[index].length == 3) {
																data1 = data[index][1];
																data2 = data[index][2];
															}
															if (data[index].length == 5) {
																data1 = data[index][1];
																data2 = data[index][2];
																data3 = data[index][3];
																data4 = data[index][4];
															}
															if (data[index].length == 6) {
																data1 = data[index][1];
																data2 = data[index][5];
																data3 = data[index][3];
																data4 = data[index][2];
															}
															$("#searchResult")
																	.append(
																			"<div>"
																					+ data1
																					+ " "
																					+ data2
																					+ " "
																					+ data3
																					+ " "
																					+ data4
																					+ "</div>");
														});
									}
								});
					});

	$(document).on('submit', '#register-form', function(e) {
		e.preventDefault();
		$.ajax({
			type : "post",
			contentType : "application/json",
			url : 'http://localhost:8080/Medical/services/signUp/doctor',
			cache : false,
			data : JSON.stringify({
				doctor_firstname : $("#FirstName").val(),
				doctor_lastname : $("#LastName").val(),
				doctor_emailId : $("#email").val(),
				speciality : $("#Speciality").val(),
				doctor_pwd : $("#Password").val()
			}),
			success : function(data) {
				if (data == undefined || !$.trim(data)) {
					alert("Oops!!!...User Can Not Be Created");
					return false;
				}
				alert("User Created");
				//$('#login-modal').fadeOut();;
			},
			dataType : 'json'
		});
	});
});

$(document).on(
		'submit',
		'#pillsForm',
		function(e) {
			e.preventDefault();
			$.ajax({
				type : "post",
				contentType : "application/json",
				url : 'http://localhost:8080/Medical/services/search/Pill/',
				cache : false,
				data : JSON.stringify({
					imprint : $("#imprint").val(),
					color : $("#color").val(),
					shape : $("#shape").val()
				}),
				success : function(data) {
					if (data == undefined || !$.trim(data)) {
						alert("Oops!!!...Pills Can't be found");
						return false;
					}
					$.each(data, function(index) {
						$("#pill_imprint").empty();
						$("#pill_Strength").empty();;
						$("#pill_Size").empty();;
						$("#pill_Color").empty();;
						$("#pill_name").empty();;
						
						
						$("#pill_imprint").append(data[index].imprint);
						$("#pill_Strength").append(data[index].strength);
						$("#pill_Size").append(data[index].size);
						$("#pill_Color").append(data[index].color);
						$("#pill_name").append(data[index].pillName);
					});

				},
				dataType : 'json'
			});
		});
