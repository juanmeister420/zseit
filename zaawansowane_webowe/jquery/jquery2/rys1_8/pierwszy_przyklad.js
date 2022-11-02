$(function () {
    let $zmiana = $('li').eq(2).html();
    $('li').eq(2).remove();
    $('ul').prepend('<li>' + $zmiana + '</li>');
});