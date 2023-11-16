package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    var firstName : String = "Syauqillah"
    var lastName : String = "Hadie Ahsana"
    var age : Int = 20
    var status : Boolean = false

    println("Name : $firstName $lastName")
    println("Age : $age")
    if (status == true) println("Status : Single \n" ) else println("Status : Tidak Single \n")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    var id = groupId
    var member = groupMember
    var sesi = session
    var text = "\nGroup ID : $id \nGroup Member :$member \nSession : $sesi"
    return println(text)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {

    var member = arrayOf("11:11 (Ahsa)","Gina","Maulana","Dariwan","Lysa","Thoriq","Adhim","Iqbal","Nisa","Ena","Lutfi","Faris")

    return listOf(member[0])
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Kelvin","Kak Shania","Kak Iffan")
    val countOfGroup = arrayOf<String>("Ahsa","Gina","Dariwan","Lysa","Maulana","Thoriq","Adhim","Iqbal","Nisa","Ena","Lutfi","Faris")

    return mentor.size+countOfGroup.size
}

fun main() {

    myProfile()

    val myTeam = myTeam()[0]
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("1", listOf("Ahsa","Gina","Dariwan","Lysa","Maulana","Thoriq","Adhim","Iqbal","Nisa","Ena","Lutfi","Faris"), "Afternoon")

}