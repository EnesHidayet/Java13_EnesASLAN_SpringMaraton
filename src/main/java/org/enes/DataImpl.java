package org.enes;

import org.enes.entity.Doktor;
import org.enes.entity.Hasta;
import org.enes.entity.Randevu;
import org.enes.repository.DoktorRepository;
import org.enes.repository.HastaRepository;
import org.enes.repository.RandevuRepository;
import org.enes.utility.enums.EBrans;
import org.enes.utility.enums.ECinsiyet;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

@Component
@RequiredArgsConstructor
public class DataImpl implements ApplicationRunner {

    private final DoktorRepository doktorRepository;
    private final RandevuRepository randevuRepository;
    private final HastaRepository hastaRepository;
    private  final Random random = new Random();
    @Override
    public void run(ApplicationArguments args) throws Exception {
        createDoktor();
        createHasta();
        createRandevu();
    }

    public void createDoktor(){
        Doktor doktor = Doktor.builder()
                .adSoyad("Enes ASLAN")
                .unvan("Prof.Dr.")
                .brans(EBrans.DERMATOLOJI)
                .build();
        doktorRepository.save(doktor);

        Doktor doktor1 = Doktor.builder()
                .adSoyad("Ahmet Yeşil")
                .unvan("Uzm.Dr.")
                .brans(EBrans.ACIL_TIP)
                .build();
        doktorRepository.save(doktor1);

        Doktor doktor2 = Doktor.builder()
                .adSoyad("Ayşe Mavi")
                .unvan("Prof.Dr.")
                .brans(EBrans.FIZYOTERAPI)
                .build();
        doktorRepository.save(doktor2);

        Doktor doktor3 = Doktor.builder()
                .adSoyad("Fatma Mor")
                .unvan("Dr.")
                .brans(EBrans.COCUK_HASTALIKLARI)
                .build();
        doktorRepository.save(doktor3);

        Doktor doktor4 = Doktor.builder()
                .adSoyad("Mehmet Siyah")
                .unvan("Doç.Dr.")
                .brans(EBrans.GASTROENTEROLOJI)
                .build();
        doktorRepository.save(doktor4);

        Doktor doktor5 = Doktor.builder()
                .adSoyad("Jale Kırmızı")
                .unvan("Uzm.Dr.")
                .brans(EBrans.GOGUS_HASTALIKLARI)
                .build();
        doktorRepository.save(doktor5);

        Doktor doktor6 = Doktor.builder()
                .adSoyad("Ekrem Kolpa")
                .unvan("Dr.")
                .brans(EBrans.BEYIN_SINIR_CERRAHISI)
                .build();
        doktorRepository.save(doktor6);

        Doktor doktor7 = Doktor.builder()
                .adSoyad("Hacı Hüsrev")
                .unvan("Prof.Dr.")
                .brans(EBrans.BEYIN_SINIR_CERRAHISI)
                .build();
        doktorRepository.save(doktor7);

        Doktor doktor8 = Doktor.builder()
                .adSoyad("Hakan Sarı")
                .unvan("Doç.Dr.")
                .brans(EBrans.KADIN_HASTALIKLARI_VE_DOGUM)
                .build();
        doktorRepository.save(doktor8);

        Doktor doktor9 = Doktor.builder()
                .adSoyad("Aleyna Tilki")
                .unvan("Uzm.Dr.")
                .brans(EBrans.PSIKIYATRI)
                .build();
        doktorRepository.save(doktor9);
    }

    public void createHasta(){

        Hasta hasta = Hasta.builder()
                .tcKimlik(random.nextLong(10000000000L,99999999999L))
                .adSoyad("Hikmet Karaman")
                .telefon("0 555 444 3322")
                .adres("Ankara")
                .yas(55)
                .cinsiyet(ECinsiyet.ERKEK)
                .build();

        hastaRepository.save(hasta);


        Hasta hasta1 = Hasta.builder()
                .tcKimlik(random.nextLong(10000000000L,99999999999L))
                .adSoyad("Ahmet Çakar")
                .telefon("0 555 444 3322")
                .adres("Ankara")
                .yas(62)
                .cinsiyet(ECinsiyet.ERKEK)
                .build();

        hastaRepository.save(hasta1);


        Hasta hasta2 = Hasta.builder()
                .tcKimlik(random.nextLong(10000000000L,99999999999L))
                .adSoyad("Hülya Koçyiğit")
                .telefon("0 555 444 3322")
                .adres("Ankara")
                .yas(25)
                .cinsiyet(ECinsiyet.KADIN)
                .build();

        hastaRepository.save(hasta2);


        Hasta hasta3 = Hasta.builder()
                .tcKimlik(random.nextLong(10000000000L,99999999999L))
                .adSoyad("Hülya Avşar")
                .telefon("0 555 444 3322")
                .adres("Ankara")
                .yas(58)
                .cinsiyet(ECinsiyet.KADIN)
                .build();

        hastaRepository.save(hasta3);


        Hasta hasta4 = Hasta.builder()
                .tcKimlik(random.nextLong(10000000000L,99999999999L))
                .adSoyad("Cüneyt Arkın")
                .telefon("0 555 444 3322")
                .adres("Ankara")
                .yas(18)
                .cinsiyet(ECinsiyet.ERKEK)
                .build();

        hastaRepository.save(hasta4);


        Hasta hasta5 = Hasta.builder()
                .tcKimlik(random.nextLong(10000000000L,99999999999L))
                .adSoyad("Azer Bülbül")
                .telefon("0 555 444 3322")
                .adres("Ankara")
                .yas(32)
                .cinsiyet(ECinsiyet.ERKEK)
                .build();

        hastaRepository.save(hasta5);


        Hasta hasta6 = Hasta.builder()
                .tcKimlik(random.nextLong(10000000000L,99999999999L))
                .adSoyad("Muazzez Ersoy")
                .telefon("0 555 444 3322")
                .adres("Ankara")
                .yas(43)
                .cinsiyet(ECinsiyet.KADIN)
                .build();

        hastaRepository.save(hasta6);


        Hasta hasta7 = Hasta.builder()
                .tcKimlik(random.nextLong(10000000000L,99999999999L))
                .adSoyad("Kemal Sunal")
                .telefon("0 555 444 3322")
                .adres("Ankara")
                .yas(28)
                .cinsiyet(ECinsiyet.ERKEK)
                .build();

        hastaRepository.save(hasta7);


        Hasta hasta8 = Hasta.builder()
                .tcKimlik(random.nextLong(10000000000L,99999999999L))
                .adSoyad("Ferdi Tayfur")
                .telefon("0 555 444 3322")
                .adres("Ankara")
                .yas(48)
                .cinsiyet(ECinsiyet.ERKEK)
                .build();

        hastaRepository.save(hasta8);


        Hasta hasta9 = Hasta.builder()
                .tcKimlik(random.nextLong(10000000000L,99999999999L))
                .adSoyad("Müslüm Gürses")
                .telefon("0 555 444 3322")
                .adres("İstanbul")
                .yas(27)
                .cinsiyet(ECinsiyet.ERKEK)
                .build();

        hastaRepository.save(hasta9);


        Hasta hasta10 = Hasta.builder()
                .tcKimlik(random.nextLong(10000000000L,99999999999L))
                .adSoyad("Asu Maralman")
                .telefon("0 555 444 3322")
                .adres("Ankara")
                .yas(17)
                .cinsiyet(ECinsiyet.KADIN)
                .build();

        hastaRepository.save(hasta10);


        Hasta hasta11 = Hasta.builder()
                .tcKimlik(random.nextLong(10000000000L,99999999999L))
                .adSoyad("Hadise Pekgöz")
                .telefon("0 555 444 3322")
                .adres("İzmir")
                .yas(30)
                .cinsiyet(ECinsiyet.KADIN)
                .build();

        hastaRepository.save(hasta11);


        Hasta hasta12 = Hasta.builder()
                .tcKimlik(random.nextLong(10000000000L,99999999999L))
                .adSoyad("Serenay Sarıkaya")
                .telefon("0 555 444 3322")
                .adres("Gaziantep")
                .yas(19)
                .cinsiyet(ECinsiyet.KADIN)
                .build();

        hastaRepository.save(hasta12);


        Hasta hasta13 = Hasta.builder()
                .tcKimlik(random.nextLong(10000000000L,99999999999L))
                .adSoyad("Cem Yılmaz")
                .telefon("0 555 444 3322")
                .adres("Ankara")
                .yas(72)
                .cinsiyet(ECinsiyet.ERKEK)
                .build();

        hastaRepository.save(hasta13);


        Hasta hasta14 = Hasta.builder()
                .tcKimlik(random.nextLong(10000000000L,99999999999L))
                .adSoyad("Cengiz Topel")
                .telefon("0 555 444 3322")
                .adres("Kıbrıs")
                .yas(34)
                .cinsiyet(ECinsiyet.ERKEK)
                .build();

        hastaRepository.save(hasta14);


        Hasta hasta15 = Hasta.builder()
                .tcKimlik(random.nextLong(10000000000L,99999999999L))
                .adSoyad("Yasemin Çiçek")
                .telefon("0 555 444 3322")
                .adres("Bitlis")
                .yas(25)
                .cinsiyet(ECinsiyet.KADIN)
                .build();

        hastaRepository.save(hasta15);


        Hasta hasta16 = Hasta.builder()
                .tcKimlik(random.nextLong(10000000000L,99999999999L))
                .adSoyad("Ayşen Gruda")
                .telefon("0 555 444 3322")
                .adres("Ankara")
                .yas(75)
                .cinsiyet(ECinsiyet.KADIN)
                .build();

        hastaRepository.save(hasta16);
    }


    public void createRandevu(){
        for (int i=0;i<50;i++){
        Randevu randevu = Randevu.builder()
                .doktorId(random.nextLong(1,10))
                .hastaId(random.nextLong(1,17))
                .tarih(LocalDate.of(random.nextInt(2022,2025),random.nextInt(1,12),random.nextInt(1,28)))
                .zaman(LocalTime.of(random.nextInt(9,17),random.nextInt(0,59),00))
                .build();

        randevuRepository.save(randevu);
        }


    }
}
