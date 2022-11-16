$(function(){
  $('input').on('keyup', function(){
    const wartosc = $(this).val();
    $('p').eq(0).text(wartosc);
  }).keyup();
}); 
  