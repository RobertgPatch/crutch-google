<!DOCTYPE>
<html>
  <head>
    <title>Crutch Clothing SF - Coming Soon!!!</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
    <script src="js/flipclock.js"></script>
	
	
    <link href="css/media.css" rel="stylesheet" type="text/css" />
	<link href="css/flipclock.css" rel="stylesheet" type="text/css" />
   
	
	<script type="text/javascript">
	var clock;

			$(document).ready(function() {

				// Grab the current date
				var currentDate = new Date();

				// Set some date in the future. In this case, it's always Jan 1
				var futureDate  = new Date("April 01 2015 04:00:00");

				// Calculate the difference in seconds between the future and current date
				var diff = futureDate.getTime() / 1000 - currentDate.getTime() / 1000;

				// Instantiate a coutdown FlipClock
				clock = $(".clock").FlipClock(diff, {
					clockFace: 'DailyCounter',
					countdown: true
				});
			});
	</script>
  </head>
  <body>
    
	<div id="logo" style="">
		<img src="img/logo3.png" style="width: 55%">
	<div class="wrapper">
	<br>
      <div class="cell">
      <div class="comingsoon">
		<img src="img/comingsoontext.png" style="width: 35%">
	</div>
        <div id="holder">
          <div class="clock"></div>
        </div>
      </div>
      
	  </div>
    </div>
  </body>
</html>
