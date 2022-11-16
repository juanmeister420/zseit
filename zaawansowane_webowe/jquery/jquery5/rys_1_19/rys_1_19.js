$(function(){
   $('#wysun').on('click', function(){
      $('#pierwszy').toogle().slideDown(1000);
    });
  
    $('#wysun2').on('click', function(){
      $('#drugi').toogle().slideUp(2000);
    });
  
    $('#wysun3').on('click' , function(){
      $('#trzeci').slideToggle('slow');
    });
});