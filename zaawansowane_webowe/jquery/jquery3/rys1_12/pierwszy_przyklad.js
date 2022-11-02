$('div').each(function(nr) {
    console.log('numer diva o nazwie', this.id, 'to', nr);

});


$('button').click(function() {
    $('a').each(function() {
        alert($(this).text());
    });
});