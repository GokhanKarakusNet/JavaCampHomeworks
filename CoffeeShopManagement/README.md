# Coffee Sales Management

Senaryo gereği Starbucks ve Nero kahve firmaları bizden bir backend projesi istemektedir. İstenilenler şu şekildedir;
-  Sisteme kullanıcı kaydı yapılacak ve bilgi verilecek
-  Nero firması herhangi bir kullanıcı doğrulaması talep etmiyor.
-  Starbucks firması kullanıcıların gerçek bir kişi olduğunu kanıtlamak için MERNİS doğrulaması istemektedir.
-  Bunları içeren bir projenin JAVA dilinde senaryo edilmesi ve oluşturulması planlanmaktadır.

# MERNİS ( Kimlik Doğrulama Servisi ) Projeye Ekleme
 
 ### Üst menüden, "File - New - Project"
 ![1](https://user-images.githubusercontent.com/36954450/117125843-bbae4680-ada2-11eb-86aa-893b1e3a1064.png)
 
 ### Wizards: kısmında "Java Project" yazıp, alt taraftan "Java Project" yazanı seçip "Next" butonuna basıyoruz.
 ![2](https://user-images.githubusercontent.com/36954450/117125948-d84a7e80-ada2-11eb-9d9e-54006cc323ea.png)
 
 ### Project name "MernisTest" olarak ekliyoruz, "Use an execution environment JRE:" kısmından JavaSE-1.8 seçiyoruz. (Mernis servisi için en stabil sürüm) ve "Finish" diyoruz.
 ![3](https://user-images.githubusercontent.com/36954450/117126179-147ddf00-ada3-11eb-9f15-5f56db8ef72a.png)
 
 ### Oluşan projeme sağ tıklayıp, "New - Other" seçiyorum.
 ![5](https://user-images.githubusercontent.com/36954450/117126299-3ecf9c80-ada3-11eb-9e3b-7f639fe91ad5.png)
 
 ### Wizards: kısmına "Web Service Client" yazıp, "Web Services altında ki Web Service Client" olanı seçiyoruz
 ### Service definition: kısmına "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?WSDL" adresini yapıştırıyorum ve "Finish" butonuna basıyoruz.
![7](https://user-images.githubusercontent.com/36954450/117126511-8524fb80-ada3-11eb-846a-fcc42e6a5a3c.png)

