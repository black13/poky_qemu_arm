#clone pok
git clone git://git.yoctoproject.org/poky

cd poky

git checkout -b yocto-2.6.1

cd ..

#cp ./local.conf.mine ./build/conf/local.conf
source ./poky/oe-init-build-env build
#bitbake -c populate_sdk


