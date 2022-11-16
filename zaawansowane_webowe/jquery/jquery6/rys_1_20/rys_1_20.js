$(function(){

  $('#start1').on('click', function(){
   const div = $('#pierwszy');
   div.animate({'left': '+=300px'}, 'slow');
   div.animate({'top': '+=50px'}, 'slow');
   div.animate({'left': '+=700px'}, 600);
   });

   $('#start2').on('click', function(){
      const div = $('#drugi');
      div.animate({'left': '+=300px'}, 'slow');
      div.animate({'top': '+=50px'}, 'slow');
      div.animate({'left': '+=700px'}, 800);
   });
   
   $('#start3').on('click', function(){
      $('#start1, #start2').click();
   });

   $('#reset').on('click', function(){
      $('#log').text(' ');  
      $('pierwszy, #drugi').css({ left: ' ', top: ' '});
   });

   $('#stop').click(function(){
      const kulka = $('.kulka');
      kulka.clearQueue();
      kulka.stop();
   });

   $('#reset').click(function() {
      location.reload();
  });
});