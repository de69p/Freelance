$(document).ready(function () {
    $('#loginForm').submit(function (e) {
        e.preventDefault();
        const email = $('#email').val();
        const password = $('#password').val();
        $.ajax({
            url: "/api/auth/login",
            method: "POST",
            contentType: "application/json",
            data: JSON.stringify({email: email, password: password}),
            success: function (data) {
                localStorage.setItem('token', data);
                window.location.href = '/home';
            },
            error: function () {
                $('#message').text('Invalid email or password').css('color', 'red');
            }
        });
    });
});


$('#signUpForm').submit(function (e) {
    e.preventDefault();
    const email = $('#signUpEmail').val();
    const password = $('#signUpPassword').val();
    $.ajax({
        url: "/api/auth/signUp",
        method: "POST",
        contentType: "application/json",
        data: JSON.stringify({email: email, password: password}),
        success: function (data) {
            $('#signUpMessage').text('User registered successfully').css('color', 'green');
        },
        error: function () {
            $('#signUpMessage').text('Email already exists').css('color', 'red');
        }
    });
});