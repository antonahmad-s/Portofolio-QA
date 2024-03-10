**Validate - login as a registered and unregistered user**

Proyek ini berisi automation testing untuk memvalidasi fitur login sebagai user terdaftar dan tidak terdaftar
pada https://webdriveruniversity.com/ menggunakan Selenium Java dan menggunakan metode Behaviour Driven Development (BDD),
tools yang digunakan adalah Cucumber, dan untuk scenario saya ditulis menggunakan Gherkin.

**Test Cases**

Berikut ini test case yang dijalankan:

![image](https://github.com/antonahmad-s/Portofolio-QA/assets/71451871/001de8fb-8da2-48af-8831-9c2bafc7e5b9)

![image](https://github.com/antonahmad-s/Portofolio-QA/assets/71451871/0f9fa406-0012-4831-9d87-c5101d3fabc6)

Untuk Script dapat dilihat pada file repository github yang sudah dilampirkan, saya membuat page object terpisah yang akan dipanggil pada script yang dibutuhkan,
kemudian untuk browser yang dijalankan telah saya setup parameter agar dapat disesuaikan untuk browser apa yang akan dijalankan.

**Cara Menjalankan**

Untuk menjalankan automation test, saya membuat class MainRunner untuk mempermudah dalam menjalankan script,
Berikut setup MainRunner tersebut :
![image](https://github.com/antonahmad-s/Portofolio-QA/assets/71451871/a3e194f4-92ab-4929-a846-3490fe56213d)

Pada MainRunner juga terdapat Konfigurasi Cucumber untuk generate report.

**Test Reports**

Automation testing dijalankan menggunakan Cucumber dan hasilnya dapat dilihat pada report berikut:
  - Cucumber HTML Report
  - Cucumber JSON Report

Dari report dapat dilihat bahwa:
Scenario login sebagai user terdaftar berhasil dijalankan dan passed
Scenario login sebagai user tidak terdaftar juga berhasil dijalankan dan menampilkan pesan error sesuai ekspektasi

Setelah proses selesai, report HTML dapat dibuka dari target/cucumber.html dan target/cucumber.json

Berikut contoh Report yang telah dihasilkan :

**Report Passed**
![image](https://github.com/antonahmad-s/Portofolio-QA/assets/71451871/a1d3f645-dbc2-4979-ad74-cc94dd4c1cc1)


**Report Failed**
![image](https://github.com/antonahmad-s/Portofolio-QA/assets/71451871/a51c2fca-d556-4a84-bc35-b67ed9abc87e)


</script>
</body>
</html>
ing cucumber.html…]()