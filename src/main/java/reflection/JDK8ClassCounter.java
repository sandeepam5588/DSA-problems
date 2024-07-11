//package reflection;
//import org.reflections.Reflections;
//import org.reflections.scanners.Scanners;
//import org.reflections.util.ClasspathHelper;
//import org.reflections.util.ConfigurationBuilder;
//
//import java.util.Set;
//
//public class JDK8ClassCounter {
//
//    public static void main(String[] args) {
//        // Define the package prefixes to scan. You can add more JDK package prefixes as needed.
//        String[] packages = {"java", "javax", "org", "com", "jdk"};
//
//        int classCount = 0;
//        int interfaceCount = 0;
//
//        for (String pkg : packages) {
//            Reflections reflections = new Reflections(new ConfigurationBuilder()
//                    .setUrls(ClasspathHelper.forPackage(pkg))
//                    .setScanners(Scanners.TypesAnnotated, Scanners.SubTypes));
//
//            Set<Class<?>> allClasses = reflections.getSubTypesOf(Object.class);
//            classCount += allClasses.stream().filter(cls -> !cls.isInterface()).count();
//            interfaceCount += allClasses.stream().filter(Class::isInterface).count();
//        }
//
//        System.out.println("Number of classes: " + classCount);
//        System.out.println("Number of interfaces: " + interfaceCount);
//    }
//}
