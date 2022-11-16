$(function(){
  $('input').on('keydown keyup keypress', function(){
    $('span').eq(0).text('    ' + event.type);
  });

  $('input').on('click dbclick mouseover mouseout', function(){
    $('span').eq(0).text('   ' + event.type);
    const target = $(event.type);
    if (target.is('h2')) $('span').eq(1).text('Nie dotyczy');
  });

  $('input, h2').on('click', function(){
    $('span').eq(2).text('    ' + event.target.nodeName);
  });
});