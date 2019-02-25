#clone pok
git clone git://git.yoctoproject.org/poky
            
cd poky
git fetch --tags
git tag

git checkout tags/yocto-2.6.1 -b my-yocto-2.6.1

cd ..
mkdir build/conf
#cp ./local.conf.mine ./build/conf/local.conf
source ./poky/oe-init-build-env build
#bitbake -c populate_sdk


