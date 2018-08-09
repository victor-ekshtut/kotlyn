

| Riječ | Objašnjenje |
| ------ | ------ |
| View | Cigla grafičkog sučelja Androida. Osnovna klasa za kreiranje grafičkog korisničkog sučelja(slika[ImageView], teksta[TextView], tipki[Button], itd.). |
| ViewHolder | Sastavni dio RecycleView-a.Koristi se za kontroliranje pogleda(View). |
| Presenter | Koristi se za generairanje pogleda(View) i pridruživanje objekata pogledima. |
| Adapter | Adapter je objekt čiji je zadatak povezati pogled(View) i podatke korištenje u tom pogledu. |
| Aktivity | Predstavlja osnovni zaslon aplikacije. |
| Fragment | Pogleda unutar aktivitya, može biti samostalan pogled, "mini" aktivity. Moguće korištenje više fragmenata unutar aktivitya, te korištenje jednog ili više fragmenata kroz više aktivitya. |
| XML | Opisni jezik korišten za uređivanje grafičkog korisničkog sučelja. |
| Kotlin | Tata. Ono što bi react htio biti |
| Java | Boilerplate |
| Design pattern | MVP, MVC, MVVM, JA TO NE ZNAM. |
| Klasa | Nacrt modela, klasa sadrži naziv, tipove i nazive varijabli i metode koje opisuju model. Realizacija klase naziva se objekt. |
| Objekt | Realizacija klase.   |
| Konstruktor | Koristi se za instanciranje klase, inicijalizira varijable klase za svaku novo kreiranu instancu. |
| Metoda | Predefinirana Android klasa. Primjer: onCreate(), on Destroy(), itd..  |
| SDK | Software Development Kit, skup programskih alata korišten za kreiranje aplikacije namjenjene nekoj platformi(Android, Play Station, iOS, itd..).  |
| ADB | Android Debug Bridge, sastavni dio Android SDK koji omogućava komunikaciju sa uređajem(testiranje apliakcije). |
| APK | Android PacKage,  format datoteke korišten od strane Android operacijskog sustava za distribuciju i instalaciju aplikacija. |
| Android Manifest | Sastavni dio Android aplikacije. Sadrži dopuštenja potrebna za rad aplikacije, naziv aplikacije, ikonu aplikacije, servise itd..  |
| Service | Radnja koja se izvršava u pozadini, ne mora sadržavati grafičko korisničko sučelje. Postoje foreground services(prednji?servisi), oni obavljaju radnju vidljivu korisniku, i background services(pozadinski servisi), oni obavljaju radnju koja nije vidljiva korisniku. |
| R klasa | Sadrži sve globalne varijable? |
| ViewGroup | Pogled roditelj koji može sadržavati druge poglede(djecu) |
| ActionBar | Text |
| Toolbar | Text |
| Notifications | Text |
| Bundle | Text |
| Layout | Text |
| Enum | Svi o tome nešto pričaju... |
| Toast | Koristi se za kratkotrajno prikazivanje informacije.|
| Context | Text |
| LinearLayout | Text |
| RelativeLayout | Text |





Activity Lifecycle:

- onCreate()
- onStart()
- onResume()
- onPause()
- onStop()
- onDestroy()
- onRestart()

Fragment Lifecycle:

- onAttach()
- onCreate()
- onCreateView()
- onActivityCreated()
- onStart()
- onResume()
- onPause()
- onStop()
- onDestroyView()
- onDestroy()
