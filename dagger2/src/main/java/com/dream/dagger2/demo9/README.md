Dagger2 @Component 和@SubComponent 区别解惑
http://blog.csdn.net/soslinken/article/details/70231089


当前很多blog和技术网站，很多文章都在讲Dagger2 的使用，一般都是在Application中生成一个AppComponent，然后其他的功能模块的Component依赖于AppComponent，但是有些文章中使用的方式是@Component(modules = PreseterModule.class, dependencies = AppComponent.class)，也有使用@Subcomponent(modules = PreseterModule.class)方式提供Component的，那么两者之间有什么明显区别？本文就来详细解释一下。
