Daha önce modellemesini yaptığınız aşağıdaki gereksinimleri koda dökünüz.

ÖNEMLİ 1 : Doğrulama işlemleri için sahte servisler oluşturunuz. Örneğin, gerçekten mail göndermeniz gerekmez.

ÖNEMLİ 2 : Gereksinimler dışında kodlama yapmayınız. Bu, Proje yönetimi ve ALM (Application LifeCycle Management) kurallarına aykırı bir yazılım geliştirici davranışıdır.


Req 1 : İş Arayanlar sisteme kayıt olabilmelidir.

Kabul Kriterleri:

    Kayıt sırasında kullanıcıdan ad, soyad, tcno, doğum yılı, e-Posta, şifre, şifre tekrarı bilgileri istenir.[!DONE]
    Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.[!DONE]
    Mernis doğrulaması yapılarak sisteme kayıt gerçekleştirilir.
    Doğrulama geçerli değilse kullanıcı bilgilendirilir.
    Daha önce kayıtlı bir e-posta veya tcno var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.
    Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir.

Req 2 : İş verenler sisteme kayıt olabilmelidir.

Kabul Kriterleri:

    Kayıt sırasında kullanıcıdan şirket adı, web sitesi, web sitesi ile aynı domaine sahip e-posta, telefon, şifre, şifre tekrarı bilgileri istenir. Burada amaç sisteme şirket olmayanların katılmasını engellemektir.
    Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
    Şirket kayıtları iki şekilde doğrulanır. Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir. HRMS personelinin (bizim :)) onayı gerekmektedir.
    Daha önce kayıtlı bir e-posta var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.

Req 3 : Sisteme genel iş pozisyonu isimleri eklenebilmelidir. Örneğin Software Developer, Software Architect.

Kabul Kriterleri:

    Bu pozisyonlar tekrar edemez. Kullanıcı uyarılır.

Req 4 : İş verenler listelenebilmelidir. (Sadece tüm liste)

Req 5 : İş arayanlar listelenebilmelidir. (Sadece tüm liste)

Req 6 : İş pozisyonları listelenebilmelidir. (Sadece tüm liste)


Github adresinizi paylaşınız.

Diğer arkadaşlarınızın kodlarını inceleyiniz. Beğenirseniz yıldız veriniz.



TODOS:
1. Implementation of the Mernis Microservice.
2. Change the EmailVerificationService & EmailService architecture by replacing fake simulation with  VerificationCode class instances.