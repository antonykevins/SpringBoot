<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="header.jsp"></jsp:include>
<center>
<h1>User Management System</h1>
<br><br>
<form action='/action' method='post'>
    <table class='table table-hover table-responsive table-bordered'>
        <tr>
        <p><a href="/home/addUser">
		<button type="button" class="btn btn-primary">Add User</button>
		</a></p>
        </tr>
 		</br></br>
        <tr>
        <p><a href="/home/listUser">
		<button type="button" name='listUser' class="btn btn-primary">List Users</button>
		</a></p>
        </tr>
    </table>
</form>