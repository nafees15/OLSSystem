<html>
 <head>
  <title>带有添加删除行功能的表格</title>
  <script type="text/javascript" src="../js/jquery-1.2.1.pack.js"></script>
<script type="text/javascript">
    //为每个表格添加“添加”，“删除”行的按钮        
    function add_bt(){
        //添加行按钮定义
        var bt_add = $("<input class='bt_add' type='button' value='add'/>");
        //删除行按钮定义
        var bt_del = $("<input class='bt_del' type='button' value='del'/>");
        //插入按钮
        $('table').before(bt_del).before('&nbsp;').before(bt_add);
        //为每个表格的每个添加行按钮关联click动作
        //以每个表格的最后一个tr元素为模板复制并append到表格内
        $('.bt_add').click(function(){
            //this指按钮元素
            var last_tr = $(this).next('table').find('tr:last');
            last_tr.after('<tr>'+last_tr.html()+'</tr>');
            var table = $(this).next('table');
            //最优为表格排序
            mark_index(table[0].id);
        });
        //为每个表格的每个删除行按钮关联click动作
        $('.bt_del').click(function(){
            var last_tr = $(this).next().next('table').find('tr:last');
            var index = last_tr[0].rowIndex;
            if(last_tr[0].rowIndex>0){
                last_tr.remove();
                var table = $(this).next().next('table');
                mark_index(table[0].id);
            }
        });
    }
    
    //为每个表格添加序号
    function mark_index(table_id){
        //定义序号的名称
        var indexName = '序号';
        //获得tables对象，如果table_id不为空，则返回指定的table元素，否则放回全部table元素集合
        var tables = typeof table_id == "string"?$('#'+table_id):$('table');
        //遍历tables并执行匿名函数
        tables.each(function(){
            var xuhao = $(this).find('tr:first').find('th:first').text();
            //添加序号列
            if(xuhao != indexName){
                $(this).find('tr').each(function(){
                    if(this.rowIndex == 0)
                        $(this.firstChild).before('<th align=center>'+indexName+'</th>');
                    else
                        $(this.firstChild).before('<td align=center>'+this.rowIndex+'</td>');
                });                
            }else{
            //已经有序号了，只需更新
                $(this).find('tr').each(function(){
                    if(this.rowIndex != 0)
                        $(this.firstChild).text(this.rowIndex);
                });    
            }
        });        
    }
</script>

<script type="text/javascript">
    /**
     *dom文档装载完毕时执行
     */
    $(document).ready(function(){
        mark_index();//这里自动执行2个动作：1.为每个表格添加序号
        add_bt();        //2.在每个表格前添加 添加，删除行的按钮
    });
</script>
</head>
 
<body>

<table id='t1' cellSpacing=0 cellPadding=0 border=1>
    <thead>
        <tr><th>name</th><th>email</th><th>nishen</th></tr>
    </thead>
    <tbody>
        <tr><td>&nbsp;1</td><td>&nbsp;56</td><td>&nbsp;</td></tr>
        <tr><td>&nbsp;1</td><td>&nbsp;ds</td><td>&nbsp;</td></tr>
        <tr><td>&nbsp;4</td><td>&nbsp;43</td><td>&nbsp;</td></tr>
        <tr><td>&nbsp;5</td><td>&nbsp;2</td><td>&nbsp;</td></tr>
        <tr><td>&nbsp;4</td><td>&nbsp;g</td><td>&nbsp;</td></tr>
    </toboby>
</table>

<br><br>    
<table id='t2' cellSpacing=0 cellPadding=0 border=1>
    <thead>
        <tr><th>name</th><th>email</th><th>nishen</th></tr>
    </thead>
    <tbody>
        <tr><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td></tr>
        <tr><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td></tr>
        <tr><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td></tr>
        <tr><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td></tr>
        <tr><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td></tr>
    </toboby>
</table> 

</body>
</html>