# Simple Java Calculator

Bu kichik Java dasturi oddiy kalkulyator bo‘lib, quyidagi amallarni bajaradi:

- ➕ Qo‘shish
- ➖ Ayirish
- ✖️ Ko‘paytirish
- ➗ Bo‘lish (0 ga bo‘lish tekshiradi)

## 📁 Loyiha tuzilmasi

SimpleCalculator/

├── src/

│ └── calculator/

│ ├── Calculator.java

│ └── Main.java

├── .gitignore

└── README.md


---

### 📄 To‘liq `README.md`:

```markdown
# 🧮 Simple Java Calculator

**Simple Java Calculator** — bu Java dasturlash tilida yozilgan, konsol orqali ishlaydigan oddiy kalkulyator dasturi. U foydalanuvchiga asosiy arifmetik amallarni bajarish imkonini beradi: qo‘shish, ayirish, ko‘paytirish va bo‘lish.

---

## 📚 Funksiyalar

✅ Qo‘shish  
✅ Ayirish  
✅ Ko‘paytirish  
✅ Bo‘lish (0 ga bo‘lishga tekshiruv bilan)  
✅ Oddiy konsol interfeys

---

## 🗂 Loyiha tuzilmasi

```

SimpleCalculator/

├── src/


│   └── calculator/


│       ├── Calculator.java    # Arifmetik funksiyalar


│       └── Main.java          # Dastur ishga tushiriladigan nuqta


├── .gitignore                 # Git sozlamalari, keraksiz fayllarni chetga chiqaradi


├── README.md                  # Loyiha haqida batafsil ma'lumot

````

---

## 🚀 Ishga tushurish (Terminal orqali)

1. Loyihani kompyuteringizga yuklab oling:

```bash
git clone https://github.com/username/simple-java-calculator.git
cd simple-java-calculator
```

````

2. Kompilyatsiya qiling:

```bash
javac src/calculator/*.java
```

3. Dasturni ishga tushuring:

```bash
java calculator.Main
```

4. Natija:

```
3 + 2 = 5
6 / 3 = 2.0
```

---

## 🔧 Texnologiyalar

| Texnologiya | Versiya          |
| ----------- | ---------------- |
| Java        | 8+               |
| IntelliJ    | Tavsiya etiladi  |
| Git         | Versiya nazorati |

---

## 💾 Git & Commitlar

Loyihada Git ishlatilgan va quyidagi asosiy commitlar qilingan:

* ✅ `Initial commit`: loyiha strukturasi yaratildi
* ✅ `Add Calculator class`: arifmetik metodlar yozildi
* ✅ `Add Main class`: ishga tushirish kodi yozildi
* ✅ `Handle divide by zero`: xatolik nazorati qo‘shildi
* ✅ `Update .gitignore`: IntelliJ va build fayllar chiqarib tashlandi
* ✅ `Add README.md`: loyiha hujjatlari yaratildi

---

## 🔒 .gitignore

`.gitignore` fayli quyidagi elementlarni e’tiborga olmaydi:

```
.idea/
*.iml
/out/
*.class
```

Bu keraksiz IDE va kompilyatsiya fayllarining GitHub’ga chiqib ketmasligi uchun muhim.

---

## 📄 Litsenziya

Bu loyiha ochiq kodli bo‘lib, har qanday maqsadda o‘rganish va rivojlantirish uchun foydalanishingiz mumkin.

---

## 🤝 Hissa qo‘shish

Hissa qo‘shmoqchi bo‘lsangiz:

1. Fork qiling
2. Yangi branch oching: `feature/yangi-funktsiya`
3. O‘zgarishlarni qiling va commit qiling
4. Pull Request yuboring

---

## 👤 Muallif

**\[Ismingiz yoki GitHub profilingiz nomi]**
GitHub: [https://github.com/username](https://github.com/Detpool1-pixel)

---

## 📝 Qisqacha

Bu loyiha Java boshlovchilari uchun yaxshi mashq bo‘lib, konsol interfeysida arifmetik amallarni qanday amalga oshirishni o‘rgatadi.

