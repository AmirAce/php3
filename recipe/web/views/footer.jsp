<%@ page import="java.util.GregorianCalendar, java.util.Calendar" %> 

<%
GregorianCalendar currentDate = new GregorianCalendar(); 
int currentYear = currentDate.get(Calendar.YEAR);
%> 
<!--got from stocks project on github-->

<footer>
    <p>
    &copy; <%= currentYear %>  My Awesome Recipe Sites</p>
</footer>