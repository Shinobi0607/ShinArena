pluginManagement {
    repositories {
        google()
        mavenCentral()
        jcenter(){
            content {
                includeModule("com.theartofdev.edmodo", "android-image-cropper")
            }
        }
        jcenter(){
            content {
                includeModule("com.cepheuen.elegant-number-button","lib")
            }
        }
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter(){
            content {
                includeModule("com.theartofdev.edmodo", "android-image-cropper")
            }
        }
        jcenter(){
            content {
                includeModule("com.cepheuen.elegant-number-button","lib")
            }
        }
    }
}

rootProject.name = "Shin Arena"
include(":app")
