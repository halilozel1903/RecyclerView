# Recycler View Kullanımı

![Screenshot](image.png)

## Recycler View Nedir ?

List View sınıfına oldukça benzemektedir. Recycler View, verileri kullanıcıya scroll edebilecek liste içerisinde sunar. <br>
List View ile kıyaslandığında birçok avantajı bulunmaktadır. Recycler View'ın bir listeyi oluşturan View'ları daha verimli
düzenlemesi ve ListView'ın aksine ekranı scroll ederken ekran dışında kalmış View'ları yeniden oluşturmak yerine,önceden
oluşturulmuş View'ları geri dönüşümlü kullanarak tekrar geri getirdiği için daha az sistem kaynakları kullanır ve daha yüksek
bir performans gösterir. Recycler(geri dönüşüm) adınıda buradan alır. Bu özellik özellikle büyük veri listelemelerinde kayda değer bir performans artışı ve kullanım kolaylığı sağlar.

ListView'dan farklı olarak, Recycler View ayrıca sahip olduğu 3 layout manager sayesinde listedeki elemanların kullanıcıya
gösterilme şeklini seçme ve düzenleme seçeneği sunar.

1. LinearLayoutManager : Liste elemanları horizontal(dikey) ya da vertical(yatay) scroll list içerisinde gösterilir.

2. GridLayoutManager : Liste elemanları grid(ızgara) formatında gösterilir. GridLayoutManager en iyi kullanımı gösterilecek
elemanlar tek boy standart bir şekildedir.

3. StaggeredGridLayoutManager : Liste elemanları staggered(çapraz) grid formatında sunulur. StaggeredGridLayoutManager en iyi
kullanımı gösterilecek elemanlar tek boy ve standart bir şekilde olanlardır.
