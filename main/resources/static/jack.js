

var
  $sticky              = $('.ui.sticky'),
  $tocSticky           = $('.leftbox .ui.sticky'),
  $fullHeightContainer = $('.pusher > .fullheight'),
  $menu                = $('#leftbox')

  ;


  $tocSticky .sticky({
    context: $fullHeightContainer
  });

  // main sidebar
  $menu
  .sidebar({
    dimPage          : true,
    transition       : 'overlay',
    mobileTransition : 'uncover'
  })
  ;

  // launch buttons
  $menu
  .sidebar('attach events', '.launch.button, .view-ui, .launch.item')
  ;




  $('.ui.checkbox')
  .checkbox()
  ;
  $('select.dropdown')
  .dropdown()
  ;
  $('.ui.dropdown')
  .dropdown({ on: 'hover' })
  ;

 $('#centerbox')
   .transition('fade up')
 ; 
 $('#loginbox')
   .transition('scale')
 ;






  function myAlert(msg){

    $('body').append('<div class="ui mini modal" id="myAlert"><div class="header">Header</div><div class="content"> <p>' + msg + '</p></div>  <div class="actions">    <div class="ui cancel button">取消</div>  <div class="ui approve button">确定</div>   </div></div>');
    $('#myAlert').modal({
      closable  : false,
      onDeny    : function(){
        window.alert('Wait not yet!');
        $('#myAlert').remove();
        return false;
      },
      onApprove : function() {
        window.alert('Approved!');
        $('#myAlert').remove();
      }
    }).modal({
      inverted: true
    })
    .modal('show')
    ;
  }
