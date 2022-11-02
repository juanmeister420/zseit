$(function () {
    let $lista_ul = $('ul').html();
    $('ol').append($lista_ul);

    $lista_ul = $('ul').text();
    $('p').append($lista_ul);
});