Creating a new website as a home page -> `python manage.py home` not working 
-> `python manage.py startapp ~` to make a new directory write any folder name after startapp
admin.py, apps.py, models.py, tests.py, views.py will automatically create

So create manually. 
Create :

 - home/templates/home/homepage.html to set homepage.html as a homepage.
 - models.py
 - urls.py
 - views.py

Edit :
 - settings.py(root directory)
	 - add 'home'(new directory name) in INSTALLED_APPS as `'home',`
 - urls.py(root directory)
	 - `from django.urls import include, path`
	 - add `path('', include('home.urls')), ` under 'urlpatterns'
