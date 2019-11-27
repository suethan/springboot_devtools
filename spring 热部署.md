# spring 热部署

1、确保IDE idea设置正确
![image.png](https://cdn.nlark.com/yuque/0/2019/png/356083/1574840031974-6ee51ae9-62a8-4092-9a1b-6c5d56d47b51.png#align=left&display=inline&height=480&name=image.png&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&ocrLocations=%5Bobject%20Object%5D&originHeight=960&originWidth=2326&search=Preferences%20BUILDEXOCUTIONDOPLOYMENTCOMPILER%20%3FForcurrentproject%20Appearance%26Behavior%207%2Aava%2Afom%2ACL%20Resourcepatterns%3A%20zerocrmaresymbols%3AI-pathseparator%20Keymap%20use%3Bosparpteprtensando%20Editor%20Clearoutputdiroctoryonrebuild%20Plugins%20Addruntimeassertionsfornotnuannotadmme%20etersConfigureannotations.%20VersionControl%20BUILDExocUTIoNDLOYMEnT%20Automaticallyshowfirsterrorinedlitor%20BuildTools%20Displaynotificationonbuildcompletion%20%E5%A6%87%20SBuildprojectautomatically%20%28onlyworkswhllenotrunning%2Fdebugging%29%20Debugger%20RemoteJarRepositories%20.cpm%E6%97%B6L%3AIMeEDERDELCMMOGAESHMPARALREI%20%28mayrequirelargorheapsize%29%20Deployment%20%E6%9C%88Rebuildmoduleondependencychange%20ArquillianContalnors%20BuilDprocessheapsize%28Mbytes%29%20700%20ApplicationServers%20SharedbuildprocessMoptions%3B%20Clouds%20Coverage%20UseR-localbulldprocessyMoptlonsoverrldesshredoptions%29%3A%20Gradle-AndroidCompiler%20WARNING%21%20sPDRECtRiSWHEREAENERAtEDOURCESREStoREdWILLBECLE%20%22opionylearoutputDiroryebimbleehnrcontntdrctorieswheregne%20lnstantRun&size=297367&status=done&width=1163)

2、引入pom

```
 <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional>
        </dependency>
```
3、常见配置说明

```
spring.devtools.restart.enabled:false //是否开启默认是开启的
spring.devtools.restart.trigger-file=.reloadtrigger//改动该文件后进行部署
spring.devtools.restart.exclude= //不包含哪些文件
```
4、官网地址
[https://docs.spring.io/spring-boot/docs/2.2.2.BUILD-SNAPSHOT/reference/html/using-spring-boot.html#using-boot-devtools](https://docs.spring.io/spring-boot/docs/2.2.2.BUILD-SNAPSHOT/reference/html/using-spring-boot.html#using-boot-devtools)
