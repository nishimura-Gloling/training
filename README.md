# training
## 演習問題1
- 内容
  - メソッドの使い方をJava 基礎問題ドリル ～メソッドを理解する～
- パッケージ:/sample/src/main/java/com/practice
- URL: https://mitani.cs.tsukuba.ac.jp/book_support/java/java_dril_method30.pdf

## ライブラリ
- 内容
  - ライブライとは<br>
    複数のプログラムを再利用できるようにひとまとまりにしたものです。<br>
    ~.jarってファイルがあると思いますがそれがライブラリです<br>
    javaが提供しているものや、現場独自で作ったものやいろいろあります<br>
    業務系のロジック以外はほとんどがライブラリを使ってプログラムを作成します。<br><br>

    <代表例>
    - 日付処理
    - DBにアクセスする処理
    - Webのホームページ関連
    - オブジェクト配列
    
 -  ますは日付処理あたりでライブラリの使い方に慣れましょう
    -  LocalDateTime <br>
       日付系の処理を使うにはLocalDateTimeを使います<br>
       ライブラリを使用する為にはimport文を使用します<br>
       import文の場所はパッケージ文の直下で記載します<br>
       ``` java
       package com.practice;
       import java.time.LocalDateTime;
       ``` 
      
      stsまたはeclipse使ってる場合は
      エラーの解決内容にimportするがあるのでそれをダブルクリックすると解決します。
      ※現場で作業するときはほぼこちらを使ってます。
　　　![image](https://github.com/nishimura-Gloling/training/assets/138436830/8cfedb6b-0dca-49d3-8298-ad3e7747c92a)

## 演習問題2
1. LocalDateTimeを使って現在日付を表示しましょう。<br>
   ※現場とかではライブラリを使う処理はググればわかるよと言われます。<br>
     基本ライブラリは細かい使い方まで覚えていない人がほとんどです。<br>
     調査スキルを養っていただく為にググって調べていただきたいです。<br>
1. LocalDateTimeを使って日付計算をしてみましょう
   - 現在日付から2年後の日付を求めてください
   - 現在日付から4年前の日付をを求めてください
   - 現在日付から3か月後の日付を求めてください
   - 現在日付から20日前の日付を求めてください
　　![image](https://github.com/nishimura-Gloling/training/assets/138436830/fe43b477-ee27-4ab1-b94a-f199409c58b1)

## DBの接続
- 内容
  - DBの接続はライブラリを使います。<br>
  接続の仕方はいろいろありSpringJDBCを使った方法とかいろいろあります。<br>
  今回はフレームワークを使わない方法を説明します（このやり方が一番めんどくさいです)。<br>
　※間に合えばWebアプリ作成でSpringJDBC教えてます。<br>
  以下がJavaの接続と実施です。

  - DBの接続とSQL実行
  ``` java
  Connection con = null;
  //接続先情報を表す文字列の定義
  //jdbc:mysqlは固定
  //127.0.0.1 = ローカルPCのhost　基本これですが、違う場合は値を変更
  //3306　= ポート番号　基本は3306ですが違う場合は値を変更
  //demo = データベースです。アクセスしたいDBに変更してください。
  String url = "jdbc:mysql://127.0.0.1:3306/demo";

  //接続時に使用するユーザー名の定義
  String user = "root";
  //接続時に使用するパスワードの定義
  String password = "root";

  //DriverManagerを使って接続設定を記載します。
  con = DriverManager.getConnection(url, user, password);

  // sql文を記載する為のもの
  PreparedStatement stmt = null;
  stmt = con.prepareStatement("SELECT * FROM products where price  <=200");

  // executeQuery();はsqlを実行するためのものです。
  //  select文の為その値を入れるクラスをResultSetクラスのresに入れます。
  ResultSet res = stmt.executeQuery();
  ``` 


  - SQL実行後の処理<br>
  selectの場合、接続したあとResultSetで生成されたresを独自に作成したクラスに設定を行います。<br>
  Webアプリ作るとわかるのですが、画面上に値を送る時にResultSetのクラスでは送れない為、
　以下の処理が必要になる。
  
  ``` java
  //Listはライブラリを使った配列です。
  //初期化の構文はList<クラス> 変数名 = new ArrayList<クラス>()
  //<クラス>に該当のクラスを設定するとそのクラスの配列を使用することができます。
  List<Product> productList = new ArrayList<Product>();
  while (res.next()) {
    Product product = new Product();
    product.setName(res.getString("name")); -- getStringの中はDBのカラム名です。getStringはDBのvarcharになります。 
    product.setPrice(res.getInt("price")); -- getIntの中はDBのカラム名です。getIntはDBのintになります。
    productList.add(product);
  ```

  - DBを接続処理を閉じる<br>
  　接続処理を閉じる処理をクローズと言います<br>
    クローズする処理としては接続し続けてるとメモリを食ったり、接続数の設定で接続の上限数を超えた場合、他の人がSQL実行ができなくなります。<br>
    基本以下の順番クローズを行う。
  ``` java
  //ResultSetで宣言したクラス
  res.close();
  //SQL分を設定する為のクラス
  stmt.close();
  ///接続処理のクラス
  con.close();
  ```

## 演習問題3
1. Mysqlに接続してユーザのテーブルを作成してください。<br>
 
    テーブル名はusers <br>
      
    |論理名|物理名|型|備考|
    |---|---|---|---|
    | id |  id  |  int | 主キーを設定<br>AUTO_INCREMENTで自動採番してください |
    |名前|  name|  varchar(20)  | not null で　null値を入れないように設定 |
    |年齢|  age|  int  |  |
    |性別|  sex | int | 1:男性、2:女性|
 
   <br>
   ※論理名は物理名を日本語役したものです。<br>
   ※テーブル作成には全く使わないです。<br>
   
   - 一般的なルールを記載します。（現場で適用されていないところがたまにあります）<br>
     - テーブル名は複数系で小文字で設定します<br>
     例　users
     - カラム名は単数形で小文字で設定します <br>
     例　ユーザの名前ならname
    - 複数単語を組み合わせる時は_で繋げます。今回は使わないですが
      ※スネーク形式と呼ばれてる設定の仕方です。<br>
      例　外部キーを設定するときなど　user_id<br>  
      
1. Mysqlで以下のデータを入れてください。<br>

    |名前(name)|年齢(age)|性別(sex)|
    |---|---|---|
    |鈴木|19|1|
    |田中|19|2|
    |佐藤|20|1|
    |斎藤|20|2|
    |近本|21|1|
    |高橋|21|2|
    
1. JavaのソースでUserのクラスを作成してください。<br>

    |変数名|型|修飾子|備考|
    |---|---|---|---|
    | id | int  |private |今後の処理でUserテーブルのidを設定する|
    |name| String |private |今後の処理でUserテーブルのnameを設定する|
    |age|  int  | private |今後の処理でUserテーブルのageを設定する |
    |sex | int | private |今後の処理でUserテーブルのsexを設定する|
    
    - メソッドは上記の変数に対してsetterとgetterを設定してください　<br>
      例　setName(String name) .getName()など<br>

1. DB接続してUserテーブルから男性の子供の情報を取得してください。
1. 取得した情報をUserクラスに格納してください。
1. 格納したUserクラスを元に名前を年齢を表示してください<br>
　　○○さんは何歳です。<br>
  　※男性の子供のみ表示されること
1. 上記ができたら女性の大人も表示してください<br>
  


