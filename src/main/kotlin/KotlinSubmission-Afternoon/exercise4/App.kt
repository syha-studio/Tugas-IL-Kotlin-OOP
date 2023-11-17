package id.infinitelearning.KotlinSubmission.exercise4

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    fun main() {
        try {
            val result = divide(10, 3)
            println("Hasil pembagian: $result")
        } catch (e: Exception) {
            println("Terjadi kesalahan: ${e.message}")
        }
    }

fun divide(x: Int, y: Int): Any {
    var result : Int = x / y
    return result
}



