#clone pok
git clone git://git.yoctoproject.org/poky
            
cd poky
git fetch --tags
git tag

git checkout tags/yocto-2.6.1 -b my-yocto-2.6.1

cd ..
mkdir build/conf

source ./poky/oe-init-build-env build


