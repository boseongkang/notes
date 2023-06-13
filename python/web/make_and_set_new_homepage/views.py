from django.shortcuts import render
from .models import Post


def index(request):
    posts = Post.objects.all()
    return render(request, 'home/homepage.html',
                  {'posts': posts, })

