<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="header.jsp"></jsp:include>
<h1>Add User</h1>

<!-- Script for Age Validation -->
<script>
$(document).ready(function(){
   $( "#user-form" ).submit(function( event ) {
	  var txtVal =  $('#dob').val();
      if(!isDateAboveSixteen(txtVal)){
    	  alert('Age should be above 16');
    	  event.preventDefault();
      }
	});
function isDateAboveSixteen(txtDate)
{
	  var today = new Date();
	    var birthDate = new Date(txtDate);
	    var age = today.getFullYear() - birthDate.getFullYear();
	    var m = today.getMonth() - birthDate.getMonth();
	    if (m < 0 || (m === 0 && today.getDate() < birthDate.getDate())) 
	    {
	        age--;
	    }
	    if(age>16)
	    	return true;
	    else
	    	return false;
}
});
</script>
<form action='/home/add'  method='post' id='user-form'>
 
    <table class='table table-hover table-responsive table-bordered'>
 
        <tr>
            <td><b>Name</b></td> 
            <td><input type='text' name='name' class='form-control' maxlength="25" required/></td>
        </tr>
 
        <tr>
            <td><b>PPS Number</b></td>
            <td><input type='text' name='pps' class='form-control' required /></td>
        </tr>
 
        <tr>
            <td><b>Date Of Birth</b></td>
            <td><dob><input type='date' name='dob' data-error-msg="Age should be more than 16 years old" id='dob' class='form-control' size="20" required/></dob></td>
            
        </tr>
 		<tr>
            <td><b>Mobile Phone</b></td>
            <td><input name="phone" type="text" class='form-control' placeholder="08" pattern="^(?=\d{10}$)08\d{8,9}" >
        </tr>
         
        <tr>
            <td></td>
            <td>
                <button type="submit" class="btn btn-primary" id='btnSubmit'>Register</button>
            </td>
        </tr>
 
    </table>
    <b><c:out value="${danger}"></c:out></b>
</form>