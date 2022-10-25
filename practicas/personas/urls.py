from django.urls import path, include
from rest_framework import routers
from .views import PersonaViewSet

app_name = 'personas'

router = routers.DefaultRouter()
router.register(r'personas', PersonaViewSet)

urlpatterns = [
    path('', include(router.urls)),
]