<div align="right">
    <p>09/16/2019</p> 
<p>Armandas Rokas (s185144) 
</p>
</div>

</br>
</br>
</br>
</br>

<center><h1>
    Aflevering 1
    </h1> 
    <p> Deklarativt og programmatisk layout </p>


</br>
</br>
</br>
</br>

</br>

**Table of contents**

[TOC]

</br>
</br>
</br>
</br>

Github: https://github.com/ArmandasRokas/android_ass1

 <div style="page-break-after: always;"></div>
## Programmatisk layout

```java
TextView tv = new TextView(this);
tv.setText("Test");
setContentView(tv);
```

### Fordele

- Enkelt og nemt at forstår, hvad der foregår
- Man skal ikke bruge `findViewById()`, fordi man har alle variabler som peger på `Views`
- Man skal ikke bruge ekstra `.xml` Layout filer

### Ulemper

- Uoverskuelighed, fordi både layoutet af grænserfladen og loggikken ligger i Java-koden. Så det kan være sværere til vedligholde, når projektet udvikler sig. 

## Deklarativt layout

```java
setContentView(R.layout.activity_main);
TimeView time = findViewById(R.id.actualtime);
```

```xml
<?xml version="1.0" ecoding="utf-8"?>
<TextView xmlns:android="http://schemas.android.com/apk/res/android"
          android:layout_width="wrap_content"
          android:layout_height="wrap_content"
          android:text="Velkommen" />
```



### Fordele

- Giver et flot resultat
- Adskiller brugergrænserflade fra Java-koden (logikken)
- Man kan gøre bruge af et fedt værktøj i Android studio, som hjælper til at opsætte layoutet
- Man kan stadigvæk modificere `Views` programmatisk

### Ulemper

- Kræver ekstra `.xml` filer
- man skal bruge `findViewById()` function til at finde elementer.



## Står setContentView() øverst eller nederst når man bruger deklarativt (XML) layout ? Hvorfor?

- Øverset , fordi `setContentView()` pakker `Views` ud på skærmen, og kun bagefter `Views` kan findes ved at bruge `findViewById()`, og ikke før `setContentView()`, fordi det er der, hvor`Views` først bliver instantieret



## Står setContentView() øverst eller nederst når man bruger programmatisk (Java) layout ? Hvorfor?

- Nederst, fordi man skal oprette `Views` programmatisk, før man sætter dem i Layoutet ved at bruge `setContentView()`