package util

object CodeGen extends App {
  slick.codegen.SourceCodeGenerator.run(
    "slick.jdbc.MySQLProfile", "com.mysql.cj.jdbc.Driver",
    "jdbc:mysql://localhost/interior?user=interior&password=DesignThisSite&nullNamePatternMatchesAll=true&serverTimezone=UTC",
    "/users/npatel5/workspace/InteriorDesign-WebApps-S19/server/app/",
    "models", Option("interior"), Option("DesignThisSite"), true, false
  )
}
