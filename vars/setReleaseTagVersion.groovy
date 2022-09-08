import java.text.SimpleDateFormat

def call(){

    def date = new Date()
    def dateFormat = new SimpleDateFormat("YY.MMDD." + "${env.BUILD_NUMBER}")


}