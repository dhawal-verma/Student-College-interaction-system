<%-- 
    Document   : sendassignmentstudent
    Created on : Mar 18, 2022, 2:35:22 PM
    Author     : Dhawal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Managment</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="styles.css" rel="stylesheet" type="text/css" media="screen" />
</head>
<body>
<div id="content">

<!-- header begins -->
<div id="header"> 
  <div id="menu">
		<ul>
			<li id="button1"><a href="#"  title="">Admin</a></li>
                        <li id="button4"><a href="hodlogin.html" title="">HOD</a></li>
			<li id="button2"><a href="facultylogin.html" title="">Faculty</a></li>
			<li id="button3"><a href="studentlogin.html" title="">Student</a></li>
			<li id="button4"><a href="#" title="">About</a></li>
		</ul>
  </div>
</div>

<!-- header ends -->
<!-- content begins -->

 <div id="main"></div>
 <div id="back1">
<!--	<div id="left">		
            <h2>Welcome To Our Website</h2>

                        
                        <marquee> Lets Move this text.</marquee>
    <marquee direction="right" 
        behavior="alternate" 
        style="border:BLACK 2px SOLID">
        Geeks for Geeks
    </marquee>
        </div>	-->
     <div id = "check4">
             
             <h1>Assignment to Student</h1>
             <!--<img src = "https://www.google.com/search?q=admin+icon&sxsrf=APq-WBuuDC7X9ueuAUV8Hfpxgv05TTMhIg:1645101591129&tbm=isch&source=iu&ictx=1&vet=1&fir=w0_HSJ3toaE5SM%252ChyRewQutrNZ_nM%252C_%253BXKTEYbKXoj-JbM%252CBmdWsJbQoRBmFM%252C_%253BAcyA0BdPCxucSM%252CyUZV23h15dUAPM%252C_%253BBq7Fi2ByO2yZOM%252CItD25M9_8I7qxM%252C_%253BN17bzm2IEzKTKM%252CYlov9-87khsxjM%252C_%253BSmP8nZyMcDRbRM%252CJ3LFnydUBu7CVM%252C_%253BAjrNI9ZLskCqEM%252Cv1GWjTloOfcoQM%252C_%253BkemsT61OERGA-M%252C7Q3eocpuRzi_-M%252C_%253BtI1Z0lNwJ-eYyM%252CaiPLIaobLyElOM%252C_%253B5AJgvRAqQdvUTM%252CfePc_VX-gtx3PM%252C_%253BCMPnUiKKyuIG-M%252Cv3buvWo8t6qNXM%252C_%253BEnbDsTzdBc3p1M%252CRw6eiNy2hDSABM%252C_%253BC6d4e7njmYFSvM%252CmaFd3C0efByUfM%252C_%253BH9sSEQY68ln4qM%252CMlsH9snxD2ryNM%252C_%253BFCG3U0RfanuMVM%252CYlov9-87khsxjM%252C_%253BW2_mbmrSYrq0aM%252CL7-b464RRgNdTM%252C_&usg=AI4_-kRF3eGpSwDcsdy6tomT-M75eTWkaw&sa=X&ved=2ahUKEwirgtX_4Ib2AhXOTWwGHaYFBUIQ9QF6BAgYEAE#imgrc=XKTEYbKXoj-JbM">-->
    </div>

    <div class="center-text">
         
	<form id="form" method="post" action="Sendassignmentstudent">
        <label for="">Assignment Id:</label>
        <input type="text" name="username"/>
        <textarea name="text" cols="90" rows="30" ></textarea>
        <input id="size6" type="submit" name="submit1" value="Send" />
</form>
    </div>

	<div style="clear: both;">&nbsp;</div>
	
<!--content ends -->
<!--footer begins -->
	</div>
	<div id="bottom"></div>
</div>
<!-- footer ends-->
</body>
</html>