<html>
    <head><title>Website</title></head>
    <body>
        <div>Login form</div>
        <div style="background-color: red; color: white">${errorMessage}</div>
        <form method="post">
            <div>
                <input name="name">
                <label>Name</label>
            </div>
            <div>
                <input name="password">
                <label>Password</label>
            </div>
            <button type="submit">SUBMIT</button>
        </form>
    </body>
</html>