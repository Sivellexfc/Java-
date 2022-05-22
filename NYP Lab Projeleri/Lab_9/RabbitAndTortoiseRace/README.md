# CENG 122 Nesneye Yönelik Programlama Laboratuvarı
## LAB 9
#### 26 Nisan 2022
### 1) AMAÇ
Classları derinlemesine öğrenme,
### 2) YAPILACAKLAR

• Tavşan ve Kaplumbağa
(Benzetim: Kaplumbağa(lar) ve Tavşan(lar))'ın yarışmacı 70 tane karelik bir yolun ilk karesinden
yarışa başlayacaktır. Her kare yarış boyunca yarışmacıların bulunabileceği yerleri ifade etmektedir. 70. kareye ilk varan ya da ge¸cen, yarışmayı kazanacaktır. Yarışı kaygan bir zeminde olduğu
işin yarışmacılar zaman zaman kayabilmektedir. Her iterasyonda bir kere rasgele sayı üretilerek
yarışmacıların hangi hareketi gerçekle¸stireceği belirlenecektir. Aşağıdaki şekilde yarışmacıların
hangi hareketi yüzde kaç olasıkla gerçekle¸stirdiği verilmiştir.
Eğer yarışmacılardan biri 1 karesinden geriye kayarsa onu yine 1 karesine alın (negatif değerli
kareler kullanmayın. ) Kaplumbağa için, üretilen sayı i, 1 <= i <= 5 i¸cin “fast plod” hareketi,
6 <= i <= 7 ise “slip” hareketi, 8 <= i <= 10 i¸cin ise “slow plod” hareketi gerçekleştirilecektir.
Tavşan i¸cin ¨uretilen sayı i, 1 <= i <= 2 i¸cin Sleep, 3 <= i <= 4 i¸cin 9 kare ileri olan Big Hop,
i=5 için Big Slip hareketi gerçekleştirilecektir. Diğer olasılıklar da benzer şekilde hesaplanabilir.
Her iterasyonda, tavşan ve Kaplumbağanın 70 parçalık yoldaki yerleri H ve T harfleri ile gösterilmelidir. Boş yol kareleri ile gösterilebilir. yarış sonunda hangi Kaplumbağa kazanırsa “TORTOISE”+index+“ WINS!!! YAY!!” mesajı ekrana yazılmalıdır. Eğer bir tavşan kazanırsa
“Hare”’+index+“wins. Yuch” mesajı, beraberlik olursa “It’s a tie between ” +animal[x]
and animal[y] mesajı ekrana yazdırılmalıdır.
NOT: Bu uygulamada istenilen dersten farklı olarak Kaplumbağa ve tavşanın nesneye yönelik mantık ile kodlanması. Sisteme istenildiği kadar tavşan veya Kaplumbağa eklenip hepsinin
yarıştırılması ve sonucun ekranda görülmesi gereklidir. Yani Kaplumbağa ve tavşan dizileri oluşturmanız
gerekecektir. yarış yapıldığı bir test sınıfında farklı sayıda tavşanlar ve kaplumbağalar oluşturularak
ekran çıktıları ve kod açıklamalarının olduğu bir rapor istenmektedir. Yorum satırları da unutulmamalıdır.

![Screenshot_1](https://user-images.githubusercontent.com/91620498/169691949-92488528-f3f9-430d-824c-19bb64ca62a8.png)
