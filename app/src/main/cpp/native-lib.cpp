#include <jni.h>
#include <string>

extern "C"
jstring
Java_tr_k12_evrim_evrimnews_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
